package chap11.book.example.s110304;

import java.util.Arrays;

public class Member1 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;	// 참조 타입 필드
	public Car car;			// (깊은 복제 대상)
	
	public Member1(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member1 cloned = (Member1) super.clone(); // Object의 clone() 호출
		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	// ----- clone() 메소드 재정의 -----
	
	public Member1 getMember1() {
		Member1 cloned = null;
		try {
			cloned = (Member1) clone(); // 재정의된 clone() 메소드 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
