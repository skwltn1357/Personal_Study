import java.util.ArrayList;

public class Study_04 {
	/*
	 	1. ���ڿ��� ���ڸ� �Է��ϸ� �ش� ���ڰ� ���ڿ��� ���°�� �ִ����� ��ȯ�Ѵ� 
	 	ex) ("abcd",'c') -> 3 | ("Project",'j') -> 4
	 	
	 	2. ���ڿ� 2���� �Է� �޴´�. �׷��� �ΰ��� ���ڿ��� �̾��� �ϳ��� ���ڿ��� ��ȯ�Ѵ�
	 		(�� ���ڿ��� ���� �� ������ �������� �Ѵ�)
	 	ex) ("Project", "POS") -> "Project POS" | ("Hello World!", "Hi, Hi") -> "Hello World! Hi, Hi"
	 */
	
	public static int method1(String str, char ch) {
		char ch2;
		String st = "";
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			st += ch2;
		}
		return st.indexOf(ch);
	}
	
	public static int method3(String str, char ch) {
		char ch2;
		int num = 0;
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			if(ch2 == ch) {
				num = i;
			}
		}
		return num;
	
	}
	
	public static String method2(String st1, String st2) { 
		return st1+" "+st2;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(method1("Hello",'o'));
		
		System.out.println(method2("Project","POS"));
		System.out.println(method2("Hello World!", "Hi, Hi"));
		
		System.out.println(method3("apple",'a'));

	}
}
