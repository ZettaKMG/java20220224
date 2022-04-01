package chap18.book.example.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "D:\\캡처파일모음\\프사 캡처 모음\\Screenshot_220326_154134.jpg";
		String targetFileName = "D:/Temp/Screenshot_220326_154134.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		} // 예제를 실행하기 전에 D:\Temp 디렉토리를 먼저 생성해야 함
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
