package chap18.book.example.s180404;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\fin08\\Desktop\\Class\\work\\java\\workspace\\java20220224\\java20220224\\src\\chap18\\book\\example\\s180404\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
