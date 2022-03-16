package chap07.lecture.p99polymorphism_class;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App01 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		StreetCat streetCat = new StreetCat();
		streetCat.breathe();
		
		chihuahua.cry();
		streetCat.cry();
	}
}
