package chap08.book.example.s080702;

public interface ParentInterface {
	public void method1();
	public default void method2() { /* 실행문 */ }
}
