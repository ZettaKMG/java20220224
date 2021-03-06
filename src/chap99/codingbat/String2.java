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

	public boolean catDog(String str) {
		int cntcat = 0;
		int cntdog = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			String subcat = str.substring(i, i + 3);
			String subdog = str.substring(i, i + 3);
			if (subcat.equals("cat")) {
				cntcat++;
			} else if (subdog.equals("dog")) {
				cntdog++;
			}
		}

		return cntcat == cntdog;

	}

	public boolean catDog1(String str) {
		int catCnt = 0, dogCnt = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);
			if (sub.equals("cat")) {
				catCnt++;
			} else if (sub.equals("dog")) {
				dogCnt++;
			}
		}

		return catCnt == dogCnt;
	}
}
