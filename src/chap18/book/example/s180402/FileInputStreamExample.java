package chap18.book.example.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fin08\\Desktop\\Class\\work\\java\\workspace\\java20220224\\java20220224\\src\\chap18\\book\\example\\s180402\\FileInputStreamExample.java");
			
			int data;
			while ( (data = fis.read()) != -1 ) {
				System.out.write(data);
			}
			// ----- 1byte씩 읽고 콘솔에 출력 -----
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
