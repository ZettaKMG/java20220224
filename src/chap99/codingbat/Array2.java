package chap99.codingbat;

public class Array2 {
	public int countEvens(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % 2) == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public int centeredAverage(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (max < nums[i]) {
				max = nums[i];
			}

			if (min > nums[i]) {
				min = nums[i];
			}

			sum += nums[i];
		}
		return (sum - max - min) / (nums.length - 2);
	}

	public int centeredAverage1(int[] nums) {
		int sum = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max = (max < nums[i]) ? nums[i] : max;
			min = (min > nums[i]) ? nums[i] : min;
		}

		sum -= max;
		sum -= min;

		return sum / (nums.length - 2);
	}

	public int sum13(int[] nums) {
		int sum = 0;
		boolean is13 = false;
		boolean was13 = false;

		for (int i = 0; i < nums.length; i++) {
			is13 = nums[i] == 13;

			if (!was13 && !is13) {
				sum += nums[i];
			}

			was13 = is13;
		}

		return sum;
	}

	public int sum67(int[] nums) {
		int sum = 0;

		int i = 0;

		while (i < nums.length) {

			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				sum += nums[i];
			}

			i++;
		}

		return sum;
	}

	public boolean has22(int[] nums) {

		int i = 0;

		while (i < nums.length - 1) {
			if (nums[i] == 2) {
				int next = nums[i + 1];
				if (next == 2) {
					return true;
				}
			}

			i++;
		}

		return false;
	}

	public boolean lucky13(int[] nums) {
		int i = 0;

		while (i < nums.length) {
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
			i++;
		}

		return true;

	}

	public boolean lucky13_1(int[] nums) {

		boolean has1 = false;
		boolean has3 = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				has1 = true;
			}

			if (nums[i] == 3) {
				has3 = true;
			}
		}

		return !has1 && !has3;
	}

	public int[] fizzArray(int n) {
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = i;
		}

		return result;
	}

	public int[] fizzArray3(int start, int end) {
		int[] arr = new int[end - start];

		for (int i = start; i < end; i++) {
			arr[i - start] = i;
		}

		return arr;
	}

	public int[] shiftLeft(int[] nums) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			result[i] = nums[(i + 1) % nums.length];
		}

		return result;
	}

	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}

		for (int j = 0; j < nums.length; j++) {
			if (min > nums[j]) {
				min = nums[j];
			}
		}

		return max - min;
	}

	public int bigDiff1(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		return Math.abs(max - min);
	}

	public int bigDiff2(int[] nums) {
		java.util.Arrays.sort(nums);

		return nums[nums.length - 1] - nums[0];
	}

}
