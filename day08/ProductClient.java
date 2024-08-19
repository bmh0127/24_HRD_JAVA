package day08;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import java.io.*;
import java.net.*;

public class ProductClient {
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Scanner scanner;
	
	// 서버 연결
	public void start() throws IOException{
		  socket = new Socket("localhost", 50001);
		  dis = new DataInputStream(socket.getInputStream());
		  dos = new DataOutputStream(socket.getOutputStream());
		  System.out.println("[클라이언트] 서버에 연결됨");
		  scanner = new Scanner(System.in);
		  // 상품 목록 보여주기
		  list();
	}
	
	public void menu() throws IOException{
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
		System.out.println("선택 : ");
		String menuNo = scanner.nextLine();
		System.out.println();
		switch(menuNo) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}
	
	public void list() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
