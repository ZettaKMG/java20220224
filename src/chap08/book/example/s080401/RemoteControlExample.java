package chap08.book.example.s080401;

import chap08.book.example.s080205.RemoteControl;
import chap08.book.example.s080301.Audio;
import chap08.book.example.s080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;	// 인터페이스 변수 선언
		
		rc = new Television();		// Television 객체를 인터페이스 타입에 대입
		rc.turnOn();				// 인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();
		
		rc = new Audio();			// Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();				// 인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();
	}
}
