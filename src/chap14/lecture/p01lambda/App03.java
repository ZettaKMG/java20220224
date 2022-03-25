package chap14.lecture.p01lambda;

public class App03 {
	public static void main(String[] args) {
		MyInterface3 o2 = new MyInterface3() {
			
			public void method2() {
				
			}
			
			public void method1() {
				
			}
		};
		
		// 추상 메소드가 1개일 때만 람다식 작성 가능
		MyInterface3 o3 = () -> {
			
		};
	}
}

interface MyInterface3 {
	void method1();
	void method2();
}
