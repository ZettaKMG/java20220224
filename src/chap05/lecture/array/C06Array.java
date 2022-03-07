package chap05.lecture.array;

public class C06Array {
	// 그림 : 참조타입06.png
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 1 };
		method1(arr1);
		
		System.out.println(arr1[0]);
		
		int[] arr2 = { 10, 20, 30 };
		method1(arr2);
		
		System.out.println(arr2[0]);
	}
	
	public static void method1(int[] param) {
		param[0] *= 2;
	}
}
