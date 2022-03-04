package chap99.codingbat;

public class Array1 {
	public boolean firstLast6(int[] nums) {

		return ((nums[0] == 6) || (nums[nums.length - 1]) == 6);
	}

	public boolean sameFirstLast(int[] nums) {

		if (nums.length > 0) {
			return nums[0] == nums[nums.length - 1];
		}

		return false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		return ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]));
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] makePi() {
		// int[] arr1 = {3, 1, 4};
		// return arr1;

		// int[] arr1 = new int[] {3, 1, 4};
		// return arr1;

		// int[] arr1;
		// arr1 = new int[] {3, 1, 4};
		// return arr1;

		// return new int[] { 3, 1, 4 };
		
		int[] arr1;
		arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 1;
		arr1[2] = 4;
		
		return arr1;
	}

}
