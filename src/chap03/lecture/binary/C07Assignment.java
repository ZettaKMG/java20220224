package chap03.lecture.binary;

public class C07Assignment {
	public static void main(String[] args) {
		// ���Կ�����(�Ҵ翬����, assignment)
		// =, +=, -=, *=, /=, %/
		
		int i = 100; // 100�� i�� ����
		
		i += 3; // i�� ���� ���� ���� 3�� ���ؼ� ����
				// i = i + 3; �� ����
		System.out.println(i);
		
		i -= 9; // i�� ���� ���� ���� 9�� ���� ����
				// i = i - 9; �� ����
		System.out.println(i);
		
		i *= 2; // i�� ���� ���� ���� 2�� ���ؼ� ����
				// i = i *2
		System.out.println(i);
		
		i /=3; // i�� ���� ���� ���� 3 ���� ���� ����
			   // i = i / 3; �� ����
		System.out.println(i);
		
		i %= 3; // i�� ���� ���� ���� 3���� ���� �������� ����
				// i = i % 3; �� ����
		System.out.println(i);
		
		int j, k, l;
		
		j = k = l = i; // �����ʺ��� ����
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
	}
}
