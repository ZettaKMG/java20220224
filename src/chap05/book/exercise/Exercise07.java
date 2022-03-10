package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int[] array = { -1, -5, -3, -8, -2 };
		int max = array[0];
//		int max = Integer.MIN_VALUE;

		// 작성 위치
		/*
		 * for(int i = 0; i < array.length; i++) { if ( max < array[i] ) { max =
		 * array[i]; } else { max = max; } }
		 */
		
		// 향상된 for문 사용
		for (int item : array) {
			if (item > max) {
				max = item;
			}
		}

		System.out.println("max: " + max);

	}
}
