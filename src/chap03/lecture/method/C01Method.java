package chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println("��ɹ� 1");
		mymethod1();
		System.out.println("��ɹ� 2");
		mymethod1(); // �޼ҵ� ȣ��
		
		System.out.println("��ɹ� 3");
		mymethod1();
	}
	
	// �޼ҵ� ����
	public static void mymethod1() {
		System.out.println("���̸޼ҵ�1");
		System.out.println("���̸޼ҵ�2");
	}
}
