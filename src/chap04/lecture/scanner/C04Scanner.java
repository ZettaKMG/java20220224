package chap04.lecture.scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String str = "3 4 33 88";
		
		Scanner scanner = new Scanner(str);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println(n1 + n2 + n3 + n4);		
		
		scanner.close();
	}
}
