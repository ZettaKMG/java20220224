package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.Canine;
import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Pet;

public class App11 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<>();
		ArrayList<Canine> list2 = new ArrayList<>();
		ArrayList<Cat> list3 = new ArrayList<>();
		
		method(list1);
		method(list2);
		method(list3);
	}
	
	public static void method(ArrayList<?> list) {
		;
		;
	}
}
