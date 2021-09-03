package review;

public class B06_breakContinue {
	
	public static void main(String[] args) {
		/*
		 	# break;
		 	- �ݺ��� ���ο��� ����ϸ� �����ִ� �ݺ����� �ϳ��� Ż���Ѵ�
		 	- switch�� ���ο��� ����ϸ� switch���� Ż���Ѵ�
		 	
		 	# continue;
		 	- �ݺ��� ���ο��� ����ϸ� �ݺ��� ����� ���� �� �ݺ����� �ٷ� �Ѿ��
		 	- continue�� ���� �������� �ؿ� �ִ� �ݺ��� ����� ��� �����Ѵ�
		 	
		 */
		
		for(int i = 0; i < 10; ++i) {
			if(i == 3 || i == 4) {	
				continue;		// 0~9 �߿��� 3,4�� �ȳ��� 
			}
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; ++i) {
			if(i == 3 || i == 4) {	
				break;			// 0~2������ ����
				
			}
			System.out.println(i);
		}
		
		
		// # for���� ���� �ݺ�
		for(int i = 0; true; ++i) {
			if(i == 1000) {
				break;
			}
			System.out.println(i);
		}
	}

}
