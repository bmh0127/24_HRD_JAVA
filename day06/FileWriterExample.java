package day06;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class FileWriterExample {
	
	static FileWriter fw =null;
	static BufferedInputStream dis = null;
	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			
			// 1. 키보드로부터 문자데이터를 읽어 와서 콘솔 출력하고 파일로도 출력하기
			InputStream is = System.in;
			dis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(System.out);
			
			int data = 0;
			while((data = dis.read()) != -1) {
				bos.write(data);
				bos.flush();
			}
			
//			fw = new FileWriter("file.txt");
//			fw.write("java");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("파일이 존재하지 않습니다.");
		}finally {
			try {
				fw.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
