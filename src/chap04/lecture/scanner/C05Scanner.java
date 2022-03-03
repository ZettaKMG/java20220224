package chap04.lecture.scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째값>");
		int n1 = scanner.nextInt();

		System.out.print("두번째값>");
		int n2 = scanner.nextInt();

		System.out.print("새문자열>");
		String str = scanner.nextLine();

		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(str);

		scanner.close();
	}
}
