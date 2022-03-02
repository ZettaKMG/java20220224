package chap04.lecture.forloop;

public class C05NestedFor {
	public static void main(String[] args) {		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
			}
		}
		
		//
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
			}
		}
	}
}
