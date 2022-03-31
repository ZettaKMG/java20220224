package chap99.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> results = new ArrayList<>();

		Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());

		for (int n : set1) {
			if (set2.contains(n) || set3.contains(n)) {
				results.add(n);
			}
		}

		for (int n : set2) {
			if (set3.contains(n) && !results.contains(n)) {
				results.add(n);
			}
		}

		return results;
	}
	
	
}
