package chap04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		// 작성 위치
		String star = "*";

		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";
		}
		
		System.out.println("출력 (끝에 enter 없이)");
		
		System.out.print("출력1 ");
		System.out.print("출력2 ");
		System.out.print("출력3 ");
		System.out.println("출력4");
		System.out.println("출력5");
	}
}
