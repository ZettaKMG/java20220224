package chap99.codingbat;

public class Functional2 {
	public List<Integer> noNeg(List<Integer> nums) {
		  nums.removeIf(n -> n < 0);
		  
		  return nums;
		}
	
//	public List<Integer> noNeg(List<Integer> nums) {
//		  nums.removeIf((Integer n) -> { return n < 0; });
//		  
//		  return nums;
//		}
	
	public List<Integer> no9(List<Integer> nums) {
		  nums.removeIf(n -> n % 10 == 9);
		  
		  return nums;
		}
	
	public List<Integer> noTeen(List<Integer> nums) {
		  nums.removeIf(n -> n >= 13 && n <=19);
		  
		  return nums;
		}

}
