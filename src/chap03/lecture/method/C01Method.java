package chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println("명령문 1");
		mymethod1();
		System.out.println("명령문 2");
		mymethod1(); // 메소드 호출
		
		System.out.println("명령문 3");
		mymethod1();
	}
	
	// 메소드 정의
	public static void mymethod1() {
		System.out.println("명령문 4");
		System.out.println("명령문 5");
	}
}
