package chap03.lecture.method;

public class C05Return {
	public static void main(String[] args) {
		
		System.out.println("��ɹ�1");
		System.out.println("��ɹ�2");
		int i = myMethod2();
		System.out.println("��ɹ�3");
		System.out.println(i);
		
	}
	
	public static void myMethod1() {
		System.out.println("my method1 ��ɹ�1");
		System.out.println("my method2 ��ɹ�2");
		
		// return : 1.�޼ҵ� ����, 2.�����ʿ� �ִ� ���� ȣ���� ������ ��ȯ(return)
		
		return;
		
//		System.out.println("my method1 ��ɹ�3");
	}
	
	public static int myMethod2() {
		// �޼ҵ�� �տ� �����ϴ� ���� Ÿ���� ����ؾ� ��
		// ���� �����ϴ� ���� ������ void�� ���
		
		System.out.println("my method2 ��ɹ�1");
		
		return 3;
	}
}
