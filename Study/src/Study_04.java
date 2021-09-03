import java.util.ArrayList;

public class Study_04 {
	/*
	 	1. 문자열과 문자를 입력하면 해당 문자가 문자열에 몇번째에 있는지를 반환한다 
	 	ex) ("abcd",'c') -> 3 | ("Project",'j') -> 4
	 	
	 	2. 문자열 2개를 입력 받는다. 그러면 두개의 문자열을 이어줘 하나의 문자열로 반환한다
	 		(단 문자열을 이을 때 공백을 만들어줘야 한다)
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
