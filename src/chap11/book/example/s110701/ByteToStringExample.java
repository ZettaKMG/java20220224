package chap11.book.example.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
								 // 74번 위치(6)
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);	   // 4개(4)
	}
}
