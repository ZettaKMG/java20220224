package chap99.leetcode;

public class Solution832 {
	public int[][] flipAndInvertImage(int[][] image) {

		for (int[] row : image) {

			int left = 0; // first index
			int right = row.length - 1; // last index

			while (left <= right) {

				int temp = row[left];
				row[left] = row[right];
				row[right] = temp;

				row[left] = row[left] == 1 ? 0 : 1;
				row[right] = row[right] == 0 ? 1 : 0;

				if (left == right) {
					row[right] = row[right] == 0 ? 1 : 0;
				}

				left++;
				right--;

			}

		}

		return image;
	}
}
