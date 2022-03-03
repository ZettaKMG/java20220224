package chap04.book.exercise;

public class Exercise04_1 {
	public static void main(String[] args) {
		
		while (true) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + x + ", " + y + ")");
			
			break;
		}
	}
}
