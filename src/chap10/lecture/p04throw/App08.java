package chap10.lecture.p04throw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 다형성에 의해 FileNotFoundException, IOException 둘 다 쓰지 않고 아래처럼 하나만 써도 처리 가능
public class App08 {
	public static void main(String[] args) throws IOException {
		method1();		
	}
	
	private static void method1() throws IOException {
		FileReader fr = new FileReader("");
		fr.read();
	}
}
