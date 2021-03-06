package chap07.lecture.p01inheritance;

public class SubClass3 extends SuperClass3 {
	
	public SubClass3() {
//		super();
		// 상위 클래스의 기본 생성자(파라미터 없는 생성자)가 없으면
		// 파라미터있는 생성자를 명시적으로 호출해야 함.
		super("param");
		System.out.println("subclass3 no-args constructor");
	}
	
	public SubClass3(int i) {
//		super();
		super("ppp");
		System.out.println("subclass3 int-param constructor");
	}
}
