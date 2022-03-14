package chap06.book.example.s061301.package2;

import chap06.book.example.s061301.package1.B;

public class C {
	A a; // (x) A클래스는 package private이어서 다른 캐피지에 있는 C클래스에서 사용 불가
	B b; // (o) B클래스는 public이어서 다른 패키지에 있는 C클래스에서 사용 가능
}
