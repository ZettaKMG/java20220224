package chap99.codingbat;

public class String1 {
	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}

		return str.substring(0, 2);
	}

	public String nTwice(String str, int n) {
		String front = str.substring(0, n);
		String end = str.substring(str.length() - n);

		return front + end;
	}

	public String middleThree(String str) {
		int middle = str.length() / 2;

		return str.substring(middle - 1, middle + 2);
	}

	public boolean hasBad(String str) {
		if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasBad1(String str) {
		int i = str.indexOf("bad");

		return (i == 0) || (i == 1);
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}

		String end = str.substring(str.length() - 2);
		int i = str.indexOf(end);

		return i == 0;
	}

	public String seeColor(String str) {
		int i = str.indexOf("red");
		int j = str.indexOf("blue");

		if (i == 0) {
			return str = "red";
		} else if (j == 0) {
			return str = "blue";
		}

		return str = "";
	}

	public String seeColor1(String str) {
		if (str.indexOf("red") == 0) {
			return str = "red";
		}

		if (str.indexOf("blue") == 0) {
			return str = "blue";
		}

		return str = "";
	}
	
}
