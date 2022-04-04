package chap18.book.exercise.p11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.9", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				// 작성 위치3
				String fileName = "C:/Temp/다형성01.png";
				
				fileName = fileName.trim();
				
				System.out.println("[파일 받기 시작] " + fileName);
				// 작성 위치4
				FileOutputStream fos = new FileOutputStream(fileName);
				while ((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}				
				
				System.out.println("[파일 받기 완료]");
				
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) {
				break;
			}
		}
		
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
