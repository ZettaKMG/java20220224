package chap07.book.example.s070701;

public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
//	(여기까지 재정의)
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
