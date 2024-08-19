package day08;
import day07.ConsolChatServer;
import java.io.*;
import java.net.*;

public class ConsolChatClient implements Runnable {
	// Socket 클래스
	// DataIn,Out 객체
	static Socket socket = null;
	
	public ConsolChatClient() {
		
		try {
			socket = new Socket("192.168.0.3", 50001);		// Socket 을 통해 서버와 클라이언트 통신
			System.out.println("서버와 연결 성공 !");
			
			// 메세지 입력 객체
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in)); 
			PrintWriter pout = new PrintWriter(socket.getOutputStream(),true);	
			
			//서버가 보내주는 메세지를 계속 듣는 스레드 동작
			Thread thread = new Thread(this);
			thread.start();
			
			String msg = "";
			while((msg=key.readLine()) != null) {
				pout.println(msg);
			}
			
			
		} catch(IOException e) {
			
		}
	}

	public static void main(String[] args) {
		
		new ConsolChatClient();
		
	}

	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg = "";
			while(true) {
				clientMsg = br.readLine();
				System.out.println("From Server >> " + clientMsg);
			}
		} catch(IOException e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
	}

}
