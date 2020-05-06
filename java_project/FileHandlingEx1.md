<h1><b> Simple File Handling Examples with Java </b></h1>


1. 파일의 속성값 얻기
<pre><code>

package io_examples1;

import java.io.File;
import java.io.IOException;

public class FileInformation {
	public static void main(String[] args) throws IOException{
		File file = null;
		
		byte[] fileName = new byte[100];
		String strName;
		System.out.print("file name = ");
		
		System.in.read(fileName); // 예외 발생 // InputStream의 read에서는 byte단위의 값을 입력 받기 때문에 filename을 byte[] 으로 선언 및 사용
		strName = new String(fileName).trim(); // 위에서 읽어낸 파일 이름 받아옴
		
		file = new File(strName);
		
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : " + file.getCanonicalPath());
		System.out.println("최종 수정일 : " + new Date(file.lastModified()));
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일경로 : " + file.getPath());
		System.out.println("숨김속성 : " + file.isHidden());
		
		
	}
}

</code></pre>

<hr/>

2. 파일 입력
<pre><code>

package io_examples1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		OutputStream os = null;
		try {
			os = new FileOutputStream("memo2"); // 상대경로 // FileOutputStream은 해당 파일에 byte단위로 값을 입력해주는 클래스
//			os = new FileOutputStream("C:/Java/eclipse-workspace/memo2");
//			os = new FileOutputStream("C:\\Java\\eclipse-workspace\\memo2"); // 절대경로
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n";
				
				if(str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes());
				System.out.println(str);
			} // end while
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		finally {
			os.close();
		}
	}
}

</code></pre>

<hr/>

3. 파일 복사1
<pre><code>

package io_examples1;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) throws IOException{
		File src= new File("C:\\Windows\\explorer.exe");
		File dist = new File("C:\\Users\\박진수\\Documents\\coding\\kosta\\explorer.exe");
		
		FileInputStream fis = null;
		FileOutputStream fos= null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		int c;
		
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			
			while((c=bis.read())!=-1) {
				bos.write((char)c);
			}
			
			System.out.println("파일 복사 성공");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("파일 복사 실패");
		}finally {
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
	}
}

</code></pre>

<hr/>

4. 파일 복사2
<pre><code>

package io_examples1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		InputStream is = new FileInputStream("C:\\Users\\박진수\\Documents\\coding\\duck.jpg"); // 네트워크 통신 때 유리
		OutputStream os = new FileOutputStream("C:\\Users\\박진수\\Documents\\coding\\kosta\\copy.jpg");
		
		
		while(true) {
			int inputData = is.read();
			if(inputData==-1) break;
			os.write(inputData);
		}
		
		is.close();
		os.close();
		
		System.out.println("copy success!");
	}
} 

</code></pre>

<hr/>

5. 파일 복사 (전송 속도 개선)
<pre><code>

package io_examples1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		InputStream is = new FileInputStream("C:\\Users\\박진수\\Documents\\coding\\duck.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\박진수\\Documents\\coding\\kosta\\copy.jpg");
		
		byte[] buffer= new byte[1024*8];
		
		long start = System.currentTimeMillis();
		while(true) {
			int inputData = is.read(buffer);
			if(inputData==-1) break;
			os.write(buffer,0,inputData);
		}
		
		is.close();
		os.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println("copy success!");
		System.out.println("Time : " + (end-start));
	}
}

</code></pre>

<hr/>

6. url 주소로 파일 복사
<pre><code>

package io_examples1;

import java.io.*;
import java.net.*;

public class URLCopy {
	public static void main(String[] args) throws MalformedURLException, IOException{
		URL url= new URL("https://www.google.com/logos/doodles/2020/thank-you-emergency-services-workers-6753651837108755-s.png");
		
		// 읽기 객체
		InputStream is = url.openStream();
		// 쓰기 객체
		OutputStream os = new FileOutputStream("C:\\Users\\박진수\\Documents\\coding\\kosta\\google.png");
		
		while(true){
			int inputData = is.read();
			if(inputData==-1) break;
			os.write(inputData);
		}
		
		System.out.println("copy success");
	}
}

</code></pre>

<hr/>

7. 데이터 타입에 따라 파일에 저장
<pre><code>

package io_examples1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx01 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		File file = new File("data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
	
		dos.writeBoolean(true);
		dos.writeChar(65);
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(8800000000L);
		dos.writeFloat(12.34F);
		dos.writeDouble(8.8);
		dos.flush(); // buffer를 비우는 메소드
		
		System.out.println("data.txt파일에 "+ dos.size()+"byte save");
		
	}
}

</code></pre>

<hr/>

8. DataOutput/InputStream 으로 쓰고 읽기
<pre><code>

package io_examples1;

import java.io.*;

public class DataInputStreamEx01 {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		File file= new File("data.txt");
		FileInputStream fis = new FileInputStream(file);
		
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
		
	}
}

</code></pre>
