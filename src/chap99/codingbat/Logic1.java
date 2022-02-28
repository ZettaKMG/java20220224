package chap99.codingbat;

public class Logic1 {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return cigars >= 40;
		} else {
			return cigars >= 40 && cigars <= 60;
		}
	}

	public int dateFashion(int you, int date) {
		int result = 1;

		if (you >= 8 || date >= 8) {
			result = 2;
		}

		if (you <= 2 || date <= 2) {
			result = 0;
		}

		return result;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			return temp >= 60 && temp <= 100;
		} else {
			return temp >= 60 && temp <= 90;
		}
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int limit1 = 61;
		int limit2 = 81;

		if (isBirthday) {
			limit1 += 5;
			limit2 += 5;
		}

		if (speed >= limit2) {
			return 2;
		} else if (speed >= limit1) {
			return 1;
		} else {
			return 0;
		}
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;

		if (sum < 10 || sum > 19) {
			return sum;
		} else {
			return 20;
		}
	}

}
