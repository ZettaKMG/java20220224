package chap14.lecture.p01lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class App09 {
	public static void main(String[] args) {
		MyArrayList list1 = new MyArrayList();
		
		list1.forEach(e -> System.out.println(e));
		list1.forEach(s -> System.out.println(s.substring(0, s.length()/2)));
	}
}

class MyArrayList {
	String[] values = {"java", "spring", "jsp", "hello", "sunday"};
	
	public void forEach(Consumer<String> action) {
		for (String v : values) {
			action.accept(v);
		}
	}
}