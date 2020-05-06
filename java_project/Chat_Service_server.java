// Server //
package ex05.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer {
	HashMap clients;
	ServerSocket ss = null; // socket1
	Socket s = null; // socket2

	public TcpMultiChatServer() { // default constructor
		clients = new HashMap();
		Collections.synchronizedMap(clients); // 동기화
	}

	public void start() { // user method
		try {
			ss = new ServerSocket(8000);
			System.out.println("Server Started");

			while (true) {
				s = ss.accept();
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "]");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start(); // run method 유도
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("서버 접속 실패");
		}
	}

	public void sendToAll(String msg) { // user method
		Iterator iter = clients.keySet().iterator();
		while (iter.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(iter.next());
				dos.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class ServerReceiver extends Thread { // inner class of TcpMultiChatServer
		Socket s; // client socket
		DataInputStream dis;
		DataOutputStream dos;
		String name = "";

		public ServerReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // network 통해 읽기
				dos = new DataOutputStream(s.getOutputStream()); // network 통해 쓰기
			} catch (Exception e) {
				// TODO: handle exception
//				e.printStackTrace();
				System.out.println("서버 리시브 실패");
			}
		}

		@Override
		public void run() { // thread 실행부
			try {
				name = dis.readUTF();
				sendToAll("#" + name + "님이 입장하셨습니다."); // user method call

//				System.out.println(dos.toString().hashCode());  // 확인용
				clients.put(name, dos); // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "입니다.");

				while (dis != null) {
					sendToAll(dis.readUTF());
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name); // 접속자 목록에서 제거
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "]");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "입니다.");
			}
		}

	}

	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
