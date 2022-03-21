package chap10.book.exercise;

public class p01_05 {
//	1. 예외에 대한 설명 중 틀린 것은 무엇입니까?
//		4) 자바 표준 예외만 프로그램에서 처리할 수 있다.
//	
//	2. try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?
//		3) try {} 블록에서 return문을 사용하면 finally {} 블록은 실행되지 않는다.
//	
//	3. throws에 대한 설명으로 틀린 것은 무엇입니까?
//		3) 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.
//			
//	4. throw에 대한 설명으로 틀린 것은 무엇입니까?
//		2) 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.
//			
//	5. 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?
//		public void method1() throws NumberFormatException, ClassNotFoundException { ... }
//		오답 : 2) void method2() throws Exception { method1(); }
//		정답 : 3) try { method1(); } catch (Exception e) {} catch (ClassNotFoundException e) {}
}
