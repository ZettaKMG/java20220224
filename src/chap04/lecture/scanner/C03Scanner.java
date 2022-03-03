package chap04.lecture.scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째값>");
		String str1 = scanner.nextLine();
		int n1 = Integer.valueOf(str1);
		
		System.out.print("두번째값>");
		String str2 = scanner.nextLine();
		int n2 = Integer.valueOf(str2);
		
		System.out.println(str1 + " + " + str2 + " = " + (str1 + str2));
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		
		scanner.close();
	}
}
