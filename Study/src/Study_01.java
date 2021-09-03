import java.util.ArrayList;
import java.util.Scanner;

public class Study_01 {
	/*
	 	Ŭ���� ����
	 	1. String Ÿ���� ArrayList ������ : dic
	 	
	 	1�� �Լ� : �ϳ��� ������ �Է� ������ �ش� ���忡 �����ϴ� ���ܾ���� �迭�� ������ ��ȯ
	 	ex) I never dreamed about success, I worked for it. [2012~2021] -> ["i","never","dreamed","about","success]
	 	
	 	2�� �Լ� : �ϳ��� �ܾ �Է� ������ dic�� �ܾ �߰��ǰ� true�� ��ȯ / �̹� �ִ� �ܾ��̸� �߰����� �ʰ� false�� ��ȯ
	 	ex) never �Է� : [] -> ["never"] true / success �Է� : [] -> ["never","success"] true / never �Է� : false
	 	
	 	3�� �Լ� : method01���� ���� �迭�� dic�� ���ؼ� ���� �ܾ��� ������ ��ȯ
	 */
	
	// 1. �Լ��� �Է¹��� ���� + �Լ��� ���� Ÿ�� ���� 
	// 2. ������ ���� ����
	// 3. �Լ� ��� �����
	
	static ArrayList<String> dic = new ArrayList<>();
	
	public static String[] engWord(String str) {
		String[] word = str.split(" ");
		return word;
	}
	
	public static boolean add(String word) {
		for(int i=0; i<dic.size(); ++i) {
			if(word.equals(dic.get(i))) {
				return false;
			}
		}
		dic.add(word);
		return true;
	}
	
	public static int num(String[] word) {
		int count = 0;
		
		for(int i=0; i<dic.size(); ++i) {
			for(int j=0; j<word.length; ++j) {
				if(dic.get(i).equals(word[j])) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*
		 	method02�� �̿��� dic�� never, never, success, about�� �߰��Ѵ� (boolean�� Ȯ��)
		 	String[] word�� method01�� I never dreamed about success, I worked for it. [2012~2021] �ɰ��� �޴´�
		 	word�� dic�� �̿��� method03���� ������ Ȯ���Ѵ�.
		 */
		
		System.out.println(add("never"));
		System.out.println(add("never"));
		System.out.println(add("success"));
		
		System.out.println(add("about"));
		
		System.out.println(num(engWord("I never dreamed about success")));
	}	
}
