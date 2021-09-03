package study2.BackJun;

public class Test1 {
	//https://www.acmicpc.net/problem/1712
	
	//ex) 1000 70 170 �Է� -> 11 ���
	// 1000(����) + 70(����) * 10(����) = 1700
	// 170 * 10(�Ǹ�) = 1700
	// ���ʷ�  �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN POINT)�̶�� �Ѵ�.
	
	public static int num(int a, int b, int c) {
		int count = 0;
		boolean boo = true;
		
		while(boo) {
			++count;
			if(a + b * count < c * count) {
				boo = false;
			}//else {
//				count = -1;
//				boo = false;
//			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(num(2100000000 , 9, 10));
	}
}
