package review;
import java.util.Scanner;

public class A09_Operator02 {
	
	public static void main(String[] args) {
		
		/*
		 	# �� ������
		 	- �� ���� ���ϴ� ����
		 	- �� ������ ����� boolean Ÿ���̴� ( �� �Ǵ� ����)
		 	- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		 */
		int a = 10, b = 7;
		System.out.println(a > b);
		System.out.println(a < b);
		
		// �ݵ�� �ε�ȣ�� ���� ���;� ��
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b);
		System.out.println(a != b);
		
		
		/*
		 	# �� ������
		 	- boolean Ÿ�� ������ �ϴ� ����
		 	- && : �� ���� ���� ��� true�� �� true
		 	- || : �� ���� �� �� �ϳ��� true���� true
		 	- ! : true�� false, false�� true(Not)
		 */
		
		System.out.println("true && true : " + (true && true));
		System.out.println("true && true : " + (true && false));
		System.out.println("true && true : " + (false && true));
		System.out.println("true && true : " + (false && false));
		
		System.out.println("true || true : " + (true || true));
		System.out.println("true || true : " + (true || false));
		System.out.println("true || true : " + (false || true));
		System.out.println("true || true : " + (false || false));
		
		int c = 40;
		System.out.println(c % 2 == 0);
		
		//c�� ¦���̰ų� 50���� ũ��
		System.out.println(c % 2 == 0 || c > 50);
		
		
		// ��������
		// - ���� x , y , z�� ��� 3�� ����� �ƴ� �� true�� �Ǵ� �񱳿����� ����� ������
		
		int x=4 , y=5 , z=7;
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0 );
		System.out.println(!(x % 3 != 0 && y % 3 != 0 && z % 3 != 0));
				
	}

}
