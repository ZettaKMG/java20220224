package chap99.codingbat;

public class String2 {
	public String doubleChar(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i);
			result += str.charAt(i);
		}

		return result;
	}

	public int countHi(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				cnt++;
			}
		}

		return cnt;
	}
}
