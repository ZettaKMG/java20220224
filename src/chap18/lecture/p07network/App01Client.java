package chap18.lecture.p07network;

import java.net.InetSocketAddress;
import java.net.Socket;

public class App01Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		
		socket.connect(new InetSocketAddress("172.30.1.9", 38080), 5000);
		System.out.println("[클라이언트쪽 소켓 생성됨]");
		
		if (socket != null) {
			socket.close();
		}
		
		System.out.println("프로그램 종료");
	}
}
