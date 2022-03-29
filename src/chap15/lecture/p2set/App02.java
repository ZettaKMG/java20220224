package chap15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		// Lotto : 1~45의 임의의 값 6개

		// 1~45의 임의의 값 6개를 중복없이 출력 코드 작성
		Set<Integer> lotto = new HashSet<>();

		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);				
		}

		System.out.println(lotto.size()); // 6 or not
		System.out.println(lotto);

	}
}
