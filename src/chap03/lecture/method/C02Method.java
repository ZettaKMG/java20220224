package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		System.out.println("��ɹ�1");
		myMethod1(300);
		System.out.println("��ɹ�2");
		myMethod1(3);
		System.out.println("��ɹ�3");
	}
	
	// �޼ҵ�� : lowerCamelCase	
	// ()�� �Ķ���� Ÿ�԰� �̸� �ۼ� ����	
	public static void myMethod1(int i) {
		System.out.println("���̸޼ҵ� 1");
		System.out.println("�Ķ���� i�� �� : " + i);
	}
}
