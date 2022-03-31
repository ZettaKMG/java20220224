package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {
//	public int findDuplicate(int[] nums) {
//		Set<Integer> set = new HashSet<>();
//
//		int len = nums.length;
//		for (int i = 0; i < len; i++) {
//			if (!set.add(nums[i])) {
//				return nums[i];
//			}
//		}
//
//		return len;
//	}

	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}

		return 0;
	}
}
