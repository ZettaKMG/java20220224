package chap18.book.example.s180502;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/다형성01.png"); // FileOutputStream 직접 사용
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data); // FileOutputStream 직접 사용
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		
		fis = new FileInputStream("C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\java20220224\\output\\다형성01.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/다형성01.png");
		bos = new BufferedOutputStream(fos); // BufferedOutputStream 사용
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data); // BufferedOutputStream 사용
 		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		System.out.println("사용했을 때: " + (end - start) + "ms");
	}
}
