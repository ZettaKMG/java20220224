package chap99;

public class practice {
	public static void main(String[] args) {
//		int i = 0;
//		
//		while(i<10) {
//			i++;
//		}
//		System.out.println(i);
		
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.println("hello");
//				if (i == 0) {
//					break;
//				}
//			}
//		}
		
//		for (int i = 0; i < 5; i++) {
//			if(i>3) {
//				continue;				
//			}
//			System.out.println("java");
//		}
		
		int[] a = new int[2];
		int[] b = a;
		
		a[0] = 7;
		a[1] = 3;
		
		System.out.println(b[0]+b[1]);
	}
}
