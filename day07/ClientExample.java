package day07;
import java.io.*;
import java.net.*;

public class ClientExample {
	
	Socket socket;
	static DataInputStream dis = null;
	static DataOutputStream dos =null;
	
	public ClientExample() throws IOException{
		socket = new Socket("localhost",5555);
		System.out.println("서버와 연결 성공!!!!");
		
		dis = new DataInputStream(socket.getInputStream());
		String message = dis.readUTF();
		System.out.println("서버 >>> " + message);
	}
	
	public static void main(String[] args) throws IOException {
		
		new ClientExample();
		
	}

}
