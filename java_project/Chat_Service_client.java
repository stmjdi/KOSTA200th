package ex05.net.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatClient { // outer class
	
	static class ClientSender extends Thread{
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s=s;
			try {
				dos=new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {e.printStackTrace();}
		}
		
		
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력 받기
			try {
				if(dos!=null) {
					dos.writeUTF(name);
					while(dos!=null) dos.writeUTF("[" + name + "] " + sc.nextLine());
				}
			} catch (Exception e) {e.printStackTrace();}
		} // inner class
		
	}
	
	static class ClientReceiver extends Thread{
		Socket s;
		DataInputStream dis;
		
		
		public ClientReceiver(Socket s) {
			this.s=s;
			try {
				dis =new DataInputStream(s.getInputStream());
			} catch (Exception e) {e.printStackTrace();}
		}
		
		@Override
		public void run() {
			while(dis!=null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {e.printStackTrace();}
			}
		} // inner class
		
	}
	
	
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE : java TcpMultiChatClient 대화명");
			System.exit(0);
		}
		
		try {
			String ip = "192.168.0.117";
			Socket s = new Socket(ip,2000);
			System.out.println("서버에 연결되었습니다.");
			Thread send = new Thread(new ClientSender(s,args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));
			
			send.start();
			receiver.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
