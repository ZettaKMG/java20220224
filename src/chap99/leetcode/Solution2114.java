package chap99.leetcode;

public class Solution2114 {
	public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            String[] arr = str.split(" ");
            max = arr.length > max ? arr.length : max;
        }
        return max;
    }
}
