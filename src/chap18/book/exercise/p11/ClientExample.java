package chap18.book.exercise.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.9", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png";
		File file = new File(filePath);
		
		String fileName = file.getName();
		// 작성 위치1
		FileInputStream fis = new FileInputStream(fileName);
		byte[] datas = new byte[1000];
		
		System.out.println("[파일 보내기 시작] " + fileName);
		// 작성 위치2
		int len = 0;
		while ((len = fis.read(datas)) != -1) {
			os.write(datas, 0, len);
		}	
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
