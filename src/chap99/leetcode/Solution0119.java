package chap99.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution0119 {
	//	public List<Integer> getRow(int rowIndex) {
	//        List<Integer> list1 = new ArrayList<>();
	//        list1.add(1);
	//    
	//        for(int i = 1; i <= rowIndex; i++) {
	//            ArrayList<Integer> list2 = new ArrayList<>();
	//            list2.add(1);
	//            for(int j = 0; j < list1.size()-1; j++) 
	//                list2.add(list1.get(j) + list1.get(j+1));
	//                list2.add(1);   
	//                list1 = list2;            
	//        }
	//              
	//        return list1;
	//        
	//    }

	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>();
		result.add(1);

		// 일 잘하게끔 작성
		for (int i = 0; i < rowIndex; i++) {
			result = nextRow(result);
		}

		return result;
	}

	private List<Integer> nextRow(List<Integer> cur) {
		List<Integer> next = new ArrayList<>();

		next.add(1);

		// 더하는 일
		for (int i = 0; i < cur.size() - 1; i++) {
			Integer sum = cur.get(i) + cur.get(i + 1);
			next.add(sum);
		}

		next.add(1);

		return next;
	}
}
