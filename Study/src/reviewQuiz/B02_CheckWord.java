package reviewQuiz;

import java.util.Scanner;

public class B02_CheckWord {

	
	public static void main(String[] args) {
		
		/*
		 	����ڷκ��� �ܾ �ϳ� �Է¹ް� 
		 	ù��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�,
		 	��ġ���� ������ "NOT OK"�� ����غ�����.
		 */

		
		Scanner sc = new Scanner(System.in);
		//���� Ǯ��
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
//		
//		if(word.charAt(0) >= 'a' || word.charAt(0) <= 'z'|| word.charAt(0) >= 'A' || word.charAt(0) <= 'Z' &&
//				word.charAt(0) == word.charAt(word.length()-1)) {
//			System.out.println("OK");	
//		}else {
//			System.out.println("NOT OK");
//			
//		}
		
		
		//������ Ǯ��
		
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length()-1);
		
		boolean match = first_letter == last_letter;
		boolean alphabet = (first_letter >= 'A' && first_letter <= 'Z') ||
				(first_letter >= 'a' && first_letter <= 'z');
		
			
		if (match && alphabet) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}



}















