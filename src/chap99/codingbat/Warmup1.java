package chap99.codingbat;

public class Warmup1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		return a == b ? (a + b) * 2 : a + b;
	}

	public int diff21(int n) {
		int dif = 21 - n;
		return (dif >= 0) ? dif : dif * (-2);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
		return ((a + b == 10) || ((a == 10) || (b == 10)));
	}

	public boolean nearHundred(int n) {
		return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
	}

	public boolean nearHundred_1(int n) {
		int diff1 = 100 - n;
		int diff2 = 200 - n;

		if (Math.abs(diff1) <= 10 || Math.abs(diff2) <= 10) {
			return true;
		}

		return false;
	}

	public boolean posNeg(int a, int b, boolean negative) {

		if (negative) {
			return a < 0 && b < 0;
		} else {
			return a * b < 0;
		}
	}

	public String notString(String str) {

		String front = "";
		if (str.length() >= 3) {
			front = str.substring(0, 3);
		}

		if (front.equals("not")) {
			return str;
		} else {
			return "not " + str;
		}

	}

}
