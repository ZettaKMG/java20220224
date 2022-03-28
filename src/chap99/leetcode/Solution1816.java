package chap99.leetcode;

import java.util.Arrays;

public class Solution1816 {
	public String truncateSentence(String s, int k) {
		String[] arr = s.split(" ");

		String[] res = Arrays.copyOf(arr, k);

		String str = String.join(" ", res);

		return str;
	}
}