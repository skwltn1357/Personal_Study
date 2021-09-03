
public class Study_03_2 {
	
	// 1. 문자열과 문자를 입력받으면 해당 문자열이 문자로 시작되는지를 확인 후 true/false 반환
 	// ex) ("apple",'a') -> true / ("apple", 'b') -> false / ("banana",'b') -> true

	public static boolean method1(String str, char ch) {
		if(ch == str.charAt(0)) {
			return true;
		}
		return false;
	}
	
	//2. 문자열과 문자를 입력받으면 해당 문자열의 마지막 글자와 같으면 true/false 반환
 	// ex) ("apple",'a') -> true / ("apple", 'b') -> false / ("banana",'b') -> true

	public static boolean method2(String str, char ch) {
		if(ch == str.charAt(str.length() - 1)) {
			return true;
		}
		return false;
	}
	
	//3. 문자열과 문자를 입력받으면 해당 문자열에 문자가 몇개 포함되는지를 확인 후 반환
 	//	ex) ("mississippi",'m') -> 1 / ("mississippi",'s') -> 4

	public static int method3(String str, char ch) {
		int count = 0;
		char ch2;
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			if(ch == ch2) {
				count++;
			}
		}
		return count;
	}
	
	/* 4. 369게임, 숫자를 입력받으면 박수를 몇번 출력하는지 반환
	 	<힌트: 숫자로 입력받으면 String으로 변환한 후 한글자씩 비교할 것>
	 	ex) (369) -> 3 / (13) -> 1 / (4) -> 0 
	 */
	
	public static int method4(int num) {
		int count = 0;
		char ch2;
		String st = "";
		
		st += Integer.toString(num);
		for(int i=0; i<st.length(); ++i) {
			ch2 = st.charAt(i);
			if(ch2 == '3' || ch2 == '6' || ch2 == '9') {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(method1("apple",'a'));
		System.out.println(method2("apple",'e'));
		System.out.println(method3("apple",'p'));
	}
	
}
