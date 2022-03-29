package chap15.lecture.p2set;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class App03 {
	
	@Test
	public void test() {
		assertTrue(solution(new int[] {1, 2, 3, 3, 4, 5}));
		assertFalse(solution(new int[] {99, 88, 77, 66, 55}));
		assertFalse(solution(new int[] {}));
		assertTrue(solution(new int[] {1, 1}));
	}
	
	public boolean solution(int[] nums) {
		// nums가 중복된 값을 가지고 있으면 true, 아니면 false
		Set<Integer> set = new HashSet<>();
		
		set.add(nums)
		
		
		
		return false;
	}
}
