package day08;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

import java.io.*;
import java.net.*;


public class ProductServer {
	private ServerSocket serverSocket;
	private ExecutorService threadPool;
	private List<Product> products;
	
	public void start() throws IOException {
		serverSocket = new ServerSocket(50001);
		threadPool = Executors.newFixedThreadPool(100);
		products = new Vector<Product>();
		System.out.println("[서버] 시작됨");
		
		while(true) {
			Socket socket = serverSocket.accept();
			
			SocketClient sc = new SocketClient(socket);
		}
	}//start-------------------------------------
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdown();
			System.out.println("[서버] 종료됨");
		} catch(IOException e1) {
			
		}
	}//stop-------------------------------------
	// 중첩 클래스로 정의하기
	class SocketClient{
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		public SocketClient(Socket socket) throws IOException {
			this.socket = socket;
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			receive();
		}
		// 요청 받기
		public void receive() throws IOException{
			while(true) {
				String msg = dis.readUTF();
				JSONObject request = new JSONObject(msg);
				int menu = request.getInt("menu");
				
				switch(menu) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				}
				
			}
		}//receive----------------------------------------
	}//SocketClient-------------------------------------------
	

	
	
	public static void main(String[] args) {

	}

}
