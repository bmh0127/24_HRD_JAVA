package day08;
import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 * 멀티 서버
 * 클라이언트 요청 처리
 * 클라이언트 메세지 처리는 MultiServerRunnable 객체가 처리하도록 한다.
 */

public class MultiServer {
	ServerSocket ser;
	// 전체 클라이언트 즉 소켓객체를 담을 자료구조 ArrayList 선언
	public ArrayList<MultiServerRunnable> arrList;
	MultiServerRunnable mr;
	Socket socket;
	
	// 생성자
	public MultiServer() {
		try {
			ser = new ServerSocket(9999);
			arrList = new ArrayList<MultiServerRunnable>();
			System.out.println("서버 대기중...");
			
			while(true) {
				socket = ser.accept();
				System.out.println("연결 성공!");
				mr = new MultiServerRunnable(socket);
				arrList.add(mr);
				Thread thread = new Thread(mr);
				thread.start();
			}
		} catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) {
		new MultiServer();
	}
	
	class MultiServerRunnable implements Runnable{
		Socket sock;
		DataInputStream dis;
		DataOutputStream dos;

		
		public MultiServerRunnable(Socket sock) {
			this.sock = sock;
		}
		
		// arrlist에 있는 객체들에게 동시에 메세지 출력하는 메소드
		public void broadCasting(String msg)throws IOException{
			for(MultiServerRunnable mr : arrList) {
				if(mr != this) {
					System.out.println("Message : " + msg.toString());
					mr.send(msg);
				}
			}
		}
		
		public void send(String msg)throws IOException{
			System.out.println("send[Message] : " + msg);
			dos.writeUTF(msg);
			dos.flush();
		}

		@Override
		public synchronized void run() {
			// 서버소켓 연결하고, 상대방 메세지 읽어와서 출력하기
			boolean flag = false;
			try {
				dis = new DataInputStream(sock.getInputStream());
				dos = new DataOutputStream(sock.getOutputStream());
				
				while(!flag) {
					String msg = dis.readUTF().toString();
					System.out.println("Message : " + msg);
					this.broadCasting(msg);
				}
				
			} catch(IOException e) {
				
			}
			
		}
		
	}

}


