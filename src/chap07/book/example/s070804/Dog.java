package chap07.book.example.s070804;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍"); 
	}	
	// --- 추상 메소드 재정의 ---
}
