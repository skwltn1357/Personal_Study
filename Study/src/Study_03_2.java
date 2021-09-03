
public class Study_03_2 {
	
	// 1. ���ڿ��� ���ڸ� �Է¹����� �ش� ���ڿ��� ���ڷ� ���۵Ǵ����� Ȯ�� �� true/false ��ȯ
 	// ex) ("apple",'a') -> true / ("apple", 'b') -> false / ("banana",'b') -> true

	public static boolean method1(String str, char ch) {
		if(ch == str.charAt(0)) {
			return true;
		}
		return false;
	}
	
	//2. ���ڿ��� ���ڸ� �Է¹����� �ش� ���ڿ��� ������ ���ڿ� ������ true/false ��ȯ
 	// ex) ("apple",'a') -> true / ("apple", 'b') -> false / ("banana",'b') -> true

	public static boolean method2(String str, char ch) {
		if(ch == str.charAt(str.length() - 1)) {
			return true;
		}
		return false;
	}
	
	//3. ���ڿ��� ���ڸ� �Է¹����� �ش� ���ڿ��� ���ڰ� � ���ԵǴ����� Ȯ�� �� ��ȯ
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
	
	/* 4. 369����, ���ڸ� �Է¹����� �ڼ��� ��� ����ϴ��� ��ȯ
	 	<��Ʈ: ���ڷ� �Է¹����� String���� ��ȯ�� �� �ѱ��ھ� ���� ��>
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
