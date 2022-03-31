package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
//	public boolean divideArray(int[] nums) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int num : nums) {
//			map.put(num, map.getOrDefault(num, 0) + 1);
//		}
//
//		for (Integer key : map.keySet()) {
//			if (map.get(key) % 2 != 0) {
//				return false;
//			}
//		}
//
//		return true;
//	}

	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}

		java.util.Collection<Integer> values = map.values();
		for (Integer value : values) {
			if (value % 2 == 1) {
				return false;
			}
		}

		return true;
	}
}
