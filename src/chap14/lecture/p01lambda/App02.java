package chap14.lecture.p01lambda;

public class App02 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int c, int e) -> {
				System.out.println(c);
				System.out.println(e);			
		}; // 추상 메소드가 2개 이상이면 lambda식을 못 씀.
		
		MyInterface2 o2 = new MyInterface2() {
			@Override
			public void method1(int x, int y) {
				System.out.println(x);
				System.out.println(y);
			}
		};
	}
}

interface MyInterface2 {
	void method1(int a, int b);
}