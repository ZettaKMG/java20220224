package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 0};

		try {

			int r = arr1[0] / arr1[1];

			System.out.println(r);
		} catch (RuntimeException e) {
			System.out.println("런타임익셉션 발생");
		}

		System.out.println("프로그램 실행 계속");
	}
}
