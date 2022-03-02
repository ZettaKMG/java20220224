package chap04.lecture.forloop;

public class C02For {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}

		// x에 적절한 값을 대입해서 다음 반복문이 7번 실행되도록 하세요.
		int x = 7;
		for (int i = 1; i <= x; i++) {
			System.out.println("java");
		}

		for (int i = 5; i >= 0; i--) {
			System.out.println("spring");
		}
	}
}
