package chap99.codingbat;

public class Functional1 {
	public List<Integer> doubling(List<Integer> nums) {
		  nums.replaceAll((Integer a) -> { return a * 2; });
		//nums.replaceAll( a -> a*2 ); 도 가능
		  return nums;
		}

	public List<Integer> square(List<Integer> nums) {
		  nums.replaceAll((Integer a) -> { return a * a; });
		//nums.replaceAll( a -> a*a ); 도 가능	
		  return nums;
		}

	public List<String> addStar(List<String> strings) {
		  strings.replaceAll((String s) -> { return s + "*"; });
		//strings.replaceAll( s -> s + "*"); 도 가능   
		  return strings;
		}
	
	public List<String> copies3(List<String> strings) {
		  strings.replaceAll((String s) -> { return s + s + s; });
		//strings.replaceAll( s -> s + s + s ); 도 가능 
		
		//strings.replaceAll( s -> {
		//	String result = "";
		//  for(int i = 0; i < 3; i++) {
		//  	result += a;
		//	}
		//return result;    
		//});  
		  return strings;
		}

	public List<String> moreY(List<String> strings) {
		  strings.replaceAll((String s) -> { return "y" + s + "y"; });
		  
		  return strings;
		}

	public List<Integer> math1(List<Integer> nums) {
		  nums.replaceAll((Integer n) -> { return (n+1) * 10; });
		  
		  return nums;
		}
	
	public List<Integer> rightDigit(List<Integer> nums) {
		  nums.replaceAll((Integer n) -> { return n % 10; });
		  
		  return nums;
		}
	
	public List<String> lower(List<String> strings) {
		  strings.replaceAll((String s) -> { return s.toLowerCase(); });
		  
		  return strings;
		}
	
	public List<String> noX(List<String> strings) {

		// for (int i = 0; i < strings.size(); i++) {
		//   String r = strings.get(i);
		//   r = r.replace("x", "");

		//   strings.set(i, r);
		// }

		strings.replaceAll(s -> s.replace("x", ""));

		return strings;
	}
}
