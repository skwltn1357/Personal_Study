package reviewQuiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
	public static void main(String[] args) {
		
		/*
		 	1. ����ڰ� �Է��� ���ڿ���
		 	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		 	
		 	2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true �ƴϸ� false
		 	
		 	3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true �ƴϸ� false
		 		(����� ���ڿ� : ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
		 			 	
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str = sc.nextLine();
		
		//1��
		
		boolean contain = false;
		
		for(int i = 0; i<str.length(); ++i) {
			
			char ch = str.charAt(i);	//�ѱ��ھ� �˻�
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				contain = true;
				break;
			}
		}
		System.out.println("��� �ѹ��̶� ������ �ֳ���? " + contain);
		
		
		
		
		//2��
		
		boolean only_alpha = true;
		
		for(int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}
		}
		System.out.println("��� ��������? " + only_alpha);
		
		
		
		// 3��

		boolean first_letter_check = true, letter_check = true;
		
//		if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
//			first_letter_check = false;
//		}
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(!(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z'||
					ch == '_' || ch == '$')) {
				letter_check = false;
			}
		}
		
		if(first_letter_check && letter_check) {
			System.out.println("�ùٸ�  ���ڿ� �Դϴ� " + true);
		}else {
			System.out.println("������ ���� ���ڿ� �Դϴ�  " + false);
		}
		
	}

}











