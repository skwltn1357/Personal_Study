package review;

public class C11_ChangeValue {
	public static void main(String[] args) {
		// �� ������ ���� ���� �ٲٴ� ���
		int a = 10;
		int b = 20;
		
		int temp = a;	// temp : �ӽ�
		a = b;
		b = a;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}
