package chap99.programmers;

public class Solution12954 {
//	class Solution {
//		public long[] solution(int x, int n) {
//			long[] answer = new long[n];
//
//			for (int i = 1; i <= n; i++) {
//				answer[i - 1] = x * (long) i;
//			}
//
//			return answer;
//		}
//	}

	class Solution {
		public long[] solution(int x, int n) {
			long[] answer = new long[n];

			for (int i = 0; i < n; i++) {
				answer[i] = x * (i + 1L);
			}

			return answer;
		}
	}
}
