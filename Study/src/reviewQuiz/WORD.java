package reviewQuiz;

public class WORD {
	/*
 	����ڷκ��� �ܾ �ϳ� �Է¹ް� 
 	ù��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�,
 	��ġ���� ������ "NOT OK"�� ����غ�����.
 */

	public static String eng(String word) {

			if(((word.charAt(0) >= 'a' || word.charAt(0) <= 'z') 
					&& word.charAt(0) == word.charAt(word.length() -1))) {
				System.out.println("OK");
			}else {
				System.out.println("NOT OK");
			}
		return word;
	}
	
	public static void main(String[] args) {
		System.out.println(eng("asa"));
	}
}
