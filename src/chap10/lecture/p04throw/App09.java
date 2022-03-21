package chap10.lecture.p04throw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Exception 하나로 퉁치는 치트키성 코드
public class App09 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		FileReader fr = new FileReader(""); // FileNotFoundException
		fr.read(); // IOException
		
		Class.forName(""); // ClassNotFoundException
	}
}
