package chap04.book.example;

public class p124ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}

		// 9단 ~ 2단
		System.out.println("############# 9단 ~ 2단");
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

		// 9 X 9 = 81 ~~~~ 2 X 1 = 2
		System.out.println("############# 9 X 9 = 81 ~ 2 X 1 = 2");
		for (int k = 9; k >= 2; k--) {
			for (int l = 9; l >= 1; l--) {
				System.out.println(k + " x " + l + " = " + (k * l));
			}
		}

	}
}
