package chap03.lecture.ternary;

public class C01Ternary {
	public static void main(String[] args) {
		
		// ���׿�����
		// 1���� ? 2���� : 3����
		// ������ : 2���� �Ǵ� 3����
		// 1������ true�̸� 2����
		//		false�̸� 3����
		
		int i = true ? 1 : 2;
		System.out.println(i);
		
		int j = false ? 1 : 2;
		System.out.println(j);
		
		System.out.println(true ? "��" : "��");
		System.out.println(false ? "��" : '��');
		
		int k = 3;
		System.out.println((k != 3) ? "��" : "��");
		
		
	}
}
