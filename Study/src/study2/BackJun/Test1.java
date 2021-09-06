package study2.BackJun;

public class Test1 {
	//https://www.acmicpc.net/problem/1712
	
	//ex) 1000 70 170 �Է� -> 11 ���
	// 1000(����) + 70(����) * 10(����) = 1700
	// 170 * 10(�Ǹ�) = 1700
	// ���ʷ�  �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.
	
	public static long num(int a, int b, int c) {
		long count = 0;
		boolean boo = true;
		
		if( b > c ) {
			return -1;
		}
		
		while(boo) {
			++count;
			if(a + b * count < c * count) {
				boo = false;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(num(2100000000 , 9, 10));
	}
}
