package reviewQuiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	/*
	 	����ڷκ��� ������ �ϳ� �Է¹ް�
	 	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
	 	(��ҹ��ڵ� ������ ��)
	 */
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("���� �Է� : ");
	String text = sc.nextLine();
	
	int[] lowercount = new int[26];
	int[] uppercount = new int[26];
	
	for(int i = 0, len = text.length(); i < len; ++i) {
		char ch = text.charAt(i);
		
		if(ch >= 'a' && ch <= 'z') {
			lowercount[ch - 'a']++;
		}else if (ch >= 'A' && ch <= 'Z') {
			uppercount[ch - 'A']++;
		}
	}
	
	for(int i = 0; i < 26; ++i) {
		System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.\n", 
				'A' + i, uppercount[i]);
		System.out.printf("�ҹ��� %c�� %d�� �����߽��ϴ�.\n", 
				'a' + i, lowercount[i]);
	}
	
	

//	final String SYMBOLS = "ABCDEFGSHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//	int[] symbol_count = new int[SYMBOLS.length()];
//	
//	// Common sense is not so common.
//	for(int i = 0, len = text.length(); i < len; ++i) {
//		
//		char ch = text.charAt(i);
//		System.out.println("�̹��� �˻��� ���ڴ� '" + ch + "'�Դϴ�.");
//		
//		for(int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
//			if(ch == SYMBOLS.charAt(j)) {
//				symbol_count[j]++;
//				System.out.println("'" + ch + "'�� SYMBOLS�� "
//						+ j + "��°�� �����Ƿ� symbol_count�� " 
//						+ j + "��° ���� ������ŵ�ϴ�");
//				break;
//			}
//		}
//	}
	
}
}
