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

}
