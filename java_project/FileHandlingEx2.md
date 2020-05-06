<h1><b> Handling File Examples with Java </b></h1>


  1. Object Input/OutputStream
<pre><code>

package io_examples1;
// Make a class //
import java.io.Serializable;

public class Grade implements Serializable{
	private int score;
	private String subject;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Grade [score=" + score + ", subject=" + subject + "]";
	}
}

</code></pre>

<pre><code>

package io_examples1;
// Store class objects data in a file //
import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws Exception{
		Grade vo=new Grade();
		
		vo.setSubject("미술");
		vo.setScore(75);
		
		System.out.println(vo); // 객체로 저장된 것 화면 출력
		
		OutputStream os =new FileOutputStream("grade.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo); // 객체로 되어있는 것 파일로 저장
		oos.close();
	}
}

</code></pre>

<pre><code>

package io_examples1;
// Read object datas from the file //
import java.io.*;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
		InputStream is = new FileInputStream("grade.txt");
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		System.out.println(ois.readObject());
		ois.close();
	}
}

</code></pre>

<hr/>

  2. 파일 생성 및 직접 내용 입력
<pre><code>

package thread_ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class ThreadEx01 {
	public static void main(String[] args) throws IOException{
		String str, file;
		Date date = new Date();
		
		str = "파일 생성 시간\r\n"+date+"\r\n";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이름 입력하세요");
		file=br.readLine(); // 예외 발생 지점
		
		System.out.println("저장할 메세지 입력 하세요");
		str+=br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		
		System.out.println(file + "파일을 성공적으로 입력했습니다.");
	}
}

</code></pre>

<hr/>

  3. FileReader로 파일 읽어들이기
<pre><code>
  
 package thread_ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException{
		int i=0;
		String file;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("읽어 올 파일명을 입력하세요 ---> ");
		file=br.readLine();
		
		System.out.println(file+"문서의 내용은...");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while((i=reader.read())!=-1) {
			System.out.print((char)i);
			if(fr.equals("\n"))System.out.println();
		}
		
		fr.close();
	}
}
 
</code></pre>

<hr/>

  4. RandomAccessFile 클래스로 파일 입력
<pre><code>

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		RandomAccessFile raf = new RandomAccessFile("example.txt","rw");
		
		for(int i=0;i<=10;i++) {
			raf.seek(i*100); // 예외 발생 지점
			raf.writeInt(i);
		}
		
		System.out.println("성공");
		raf.close();
	}
}

</code></pre>

<hr/>

  5. 파일로부터 정해진 길이만큼 잘라 읽어오기
<pre><code>

import java.io.RandomAccessFile;

public class RandomAccessFileEx02 {
	public static void main(String[] args) throws Exception{
		int seekSize = 5;
		byte[] data;
		RandomAccessFile raf = new RandomAccessFile("example.txt","r");
		
		System.out.println("total length : "+raf.length()+"\n");
		
		// 루프 사이즈 = 총 길이 / seekSize + (총 길이%seekSize의 나머지==0?0:1) //
		
		long size = raf.length()/seekSize+(raf.length()%seekSize==0?0:1);
		
		for(int i=0;i<size;i+=5) {
			data = new byte[seekSize];
			raf.seek(i*seekSize);
			raf.read(data);
			
			// 바이트 데이터를 문자열로 변환(trim())을 사용해 공백을 제거)
			System.out.printf("pointer : %02d str : %s\n",raf.getFilePointer(),new String(data).trim());
		}
		
		raf.close();
	}
}

</code></pre>

<hr/>
