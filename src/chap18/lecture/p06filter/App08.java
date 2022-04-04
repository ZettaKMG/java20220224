package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		// OutputStreamWriter로 변환
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// BufferedWriter로 변환
		BufferedWriter bw = new BufferedWriter(osw);
		
		// 천만개의 문자 파일에 쓰는 코드 작성
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			bw.write('가');
		}		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		// 스트림 닫기
		bw.close();
		osw.close();
		os.close();
		
		System.out.println("종료!!!");
	}
}
