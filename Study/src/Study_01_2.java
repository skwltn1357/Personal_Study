import java.util.ArrayList;

public class Study_01_2 {
	/*
 	Ŭ���� ����
 	1. String Ÿ���� ArrayList ������ : dic
 	
 	1�� �Լ� : �ϳ��� ������ �Է� ������ �ش� ���忡 �����ϴ� ���ܾ���� �迭�� ������ ��ȯ
 	ex) I never dreamed about success, I worked for it. [2012~2021] -> ["i","never","dreamed","about","success]
 	
 	2�� �Լ� : �ϳ��� �ܾ �Է� ������ dic�� �ܾ �߰��ǰ� true�� ��ȯ / �̹� �ִ� �ܾ��̸� �߰����� �ʰ� false�� ��ȯ
 	ex) never �Է� : [] -> ["never"] true / success �Է� : [] -> ["never","success"] true / never �Է� : false
 	
 	3�� �Լ� : method01���� ���� �迭�� dic�� ���ؼ� ���� �ܾ��� ������ ��ȯ
 */
	static ArrayList<String> dic = new ArrayList();
	
	public static String[] method1(String str) {
		String[] word = str.split(" ");
		return word;
	}
	
	public static boolean method2(String str) {
		for(int i=0; i<dic.size(); ++i) {
			if(str.equals(dic.get(i))) {
				return false;
			}
		}
		dic.add(str);
		return true;
	}
	
	public static int method3(String word[]) {
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
		System.out.println(method2("never"));
		System.out.println(method2("never"));
		System.out.println(method2("success"));
		System.out.println(method2("about"));

		System.out.println(method3(method1("I never dreamed about success, I worked for it.")));

	}
}
