package chap11.book.example.s110304;

public class Member1Example {
	public static void main(String[] args) {
		// 원본 객체 생성
		Member1 original = new Member1("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		// 복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member1 cloned = original.getMember1();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		// ----- 깊은 복제 후 참조 객체의 데이터를 변경 -----
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
	}
}
