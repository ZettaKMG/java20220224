package chap04.lecture.forloop;

public class C04For {
	public static void main(String[] args) {
		System.out.println("0~4까지 출력");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("1~5까지 출력");
		for (int j = 1; j <= 5; j++) {
			System.out.println(j);
		}

		System.out.println("0~10까지 짝수만 출력");
		for (int k = 0; k <= 10; k += 2) {
			System.out.println(k);
		}

		System.out.println("1~9까지 홀수만 출력");
		for (int l = 1; l <= 9; l += 2) {
			System.out.println(l);
		}

		System.out.println("5~1까지 출력"); // 5 4 3 2 1
		for (int m = 5; m >= 1; m--) {
			System.out.println(m);
		}

		System.out.println("4~0까지 출력"); // 4 3 2 1 0
		for (int n = 4; n >= 0; n--) {
			System.out.println(n);
		}

		System.out.println("10~0까지 짝수만 출력"); // 10 8 6 4 2 0
		for (int o = 10; o >= 0; o -= 2) {
			System.out.println(o);
		}

		System.out.println("9~1까지 홀수만 출력"); // 9 7 5 3 1
		for (int p = 9; p >= 1; p -= 2) {
			System.out.println(p);
		}
	}
}
