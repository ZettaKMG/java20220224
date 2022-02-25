package chap03.book.example;

public class p91StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.contentEquals(strVar2));
		System.out.println( strVar1.contentEquals(strVar3));
	}
}
