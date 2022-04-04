package chap18.lecture.p07network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.9", 38080));
		
		System.out.println("[연결 기다림]");
		Socket socket = serverSocket.accept();
		
		System.out.println("[서버쪽 소켓 생성됨]");
		
		System.out.println("프로그램 실행 종료...");
	}
}
