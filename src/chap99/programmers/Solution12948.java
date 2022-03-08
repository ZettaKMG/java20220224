package chap99.programmers;

public class Solution12948 {
	public String solution(String phone_number) {
		String answer = "";
		String PN = phone_number;

		for (int i = 0; i < PN.length(); i++) {
			if (i < PN.length() - 4) {
				answer += "*";
			}
		}

		return answer + PN.substring(PN.length() - 4);
	}

	public String solution1(String phone_number) {
		String answer = "";

		int len = phone_number.length();

		for (int i = 0; i < len - 4; i++) {
			answer += "*";
		}

		answer += phone_number.substring(len - 4);

		return answer;
	}
}
