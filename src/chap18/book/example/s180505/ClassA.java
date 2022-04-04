package chap18.book.example.s180505;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;						// 직렬화에 포함
	ClassB field2 = new ClassB();	// 직렬화에 포함
	static int field3;			// 직렬화에서 제외
	transient int field4;		// 직렬화에서 제외
}
