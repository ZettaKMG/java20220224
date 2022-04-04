package chap18.book.exercise.p11;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png";
		File file = new File(filePath);
		
		String fileName = file.getName();
		// 작성 위치1
		
		
		
		
		
		System.out.println("[파일 보내기 시작] " + fileName);
		// 작성 위치2
		
		
		
		
		
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
