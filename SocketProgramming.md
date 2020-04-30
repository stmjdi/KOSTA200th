    <h1><b> Network/Socket Programming with Java </b></h1>


  1. simple example code - Server part
<pre><code>

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMessage { // Server단에는 socket이 2개가 필요함.
	public static void main(String[] args) throws IOException{
		ServerSocket ss = null; // server를 대표하는 socket
		Socket s = null; // client가 연결될 socket
		System.out.println("Server Start~~");
		
		try { // client와 server를 연결하는 과정에서 생기는 예외처리를 해주는 역할
			ss=new ServerSocket(9000); // 여기서 당 server의 port number 설정 -> client단에서 이 server로 접근할 수 있도록 함. 열쇠같은 역할
			s=ss.accept(); // client socket, 응답 대기 (accept())
			
			InputStream is = s.getInputStream(); // read -- 읽어들임. 말 그대로 외부로부터 입력되는 값을 받아들임 (외부: 사용자의 입력 / 외부 파일의 내용 등)
			OutputStream os = s.getOutputStream(); // write -- 내용을 입력 / 내용을 입력하는 영역은 사용자가 지정.
			
			byte[] arr = new byte[100]; // 100개씩 읽어올 심산
			is.read(arr); // read 메소드는 byte단위로 읽어들인다.
			System.out.println(new String(arr)); // 읽어들인 값을 콘솔창에 출력함


			String message = "Hello~~~"; // client 에 보낼 메시지
			
			os.write(message.getBytes()); // write 메소드도 byte단위로 보내게 되어있다. 따라서 파라미터로 ~.getBytes가 들어오는 것이 합당함. os가 가리키는 위치로 값이 입력된다.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			s.close(); ss.close();
		}
	}
}

</code></pre>

<hr/>

  2. simple example code - Client part
<pre><code>

import java.io.*;
import java.net.*;

public class ClientMessage {
	public static void main(String[] args) throws IOException{
		Socket s = null;
		try {
			s=new Socket("127.0.0.1",9000);
			//I/O
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			String str = "Hi Server~~~";
			os.write(str.getBytes());
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			s.close();
		}
	}
}

</code></pre>

<hr/>

  3. Sharing datas between Server and Client - Server
<pre><code>

import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stdin = null;
		BufferedWriter bw = null;
		
		ServerSocket server=null; // socket1
		Socket client = null; // socket 2
		System.out.println("Connected... I'm a Server~");
		
		try {
			server = new ServerSocket(9090);
			client = server.accept();
			
			// 키보드로부터 입력 스트림
			stdin= new BufferedReader(new InputStreamReader(System.in));
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 클라이언트로의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			while(true) {
				inputMessage = br.readLine(); // 클라이언트에서 한행의 문자열 읽음
				// 클라이언트가 "EXIT"를 보내면 연결 종료
				if(inputMessage.equalsIgnoreCase("exit")) break;
				System.out.println(inputMessage);
				// 키보드에서 한 행의 문자열 읽음
				
				String outputMessage = stdin.readLine();
				bw.write("kingsmile Server"+outputMessage +"\n");
				bw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				client.close(); server.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("클라이언트와 채팅 중 오류 발생....");
			}
			
		}
	}
}

</code></pre>

<hr/>

  4. Sharing datas between Server and Client - Client
<pre><code>

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stdin = null;
		BufferedWriter bw = null;
		
		//ServerSocket server=null; // socket1
		Socket client = null; // socket 2
		
		try {
			client = new Socket("localhost",9090);
			br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			stdin= new BufferedReader(new InputStreamReader(System.in));
			
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while(true) {
				System.out.print("message input : ");
				outputMessage=stdin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					
					break;
				}
				
				bw.write("클라이언트 > " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("server와의 채팅 중 오류 발생 ...");
			}
		}
	}
}

</code></pre>
