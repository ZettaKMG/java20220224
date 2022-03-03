package chap04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		// 작성 위치

		boolean more = true;
		while (more) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;

			System.out.println("(" + x + ", " + y + ")");

			if ((x + y) == 5) {
				more = false;
			}
		}

	}
}
