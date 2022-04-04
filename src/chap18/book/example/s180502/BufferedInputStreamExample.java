package chap18.book.example.s180502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png");
		BufferedInputStream bis = new BufferedInputStream(fis2); // 버퍼 스트림 생성
		start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}
