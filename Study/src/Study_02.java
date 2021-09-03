import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Study_02 {
/*
 	1. abs 함수 : 숫자를 입력 받으면 해당 숫자의 절대값을 반환한다
 		ex) -123 -> 123 / 123 -> 123
 	
 	2. floor 함수 : 소수를 입력받으면 소수점 아래를 버리고 정수를 반환한다
 		ex) 123.123 -> 123 / 123.1 -> 123
 	
 	3. sysdate 함수 : 함수를 실행하면 현재 날짜를 반환한다
 		ex) 실행 -> 2021-07-13
 		
 	4. to_char 함수 : 숫자타입을 입력받으면 문자열로 변환해 반환한다
 	 	ex) 123 -> 123
 	 	
 	5. trim 함수 : 문자열과 문자를 입력받아 문자열에 해당 문자가 포함되어있으면 삭제시켜 반환
 		ex) trim("hello", o) -> hell
 		
 	6. encrypt 함수
 		ex) encrypt("abc", 1) -> "bcd"
 	
 */
	
	public static String method1(String str, int num) {
		String st = "";
		char ch2;
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			
			if(ch2 == 'z') {
				st += "a";
			}else {
				ch2 += num;
				st += ch2;
			}
		}

		return st;
	}
	
	public static int absolute (int num) {
		return (Math.abs(num));
	}
	
	public static int primeNum (double num) {
		return (int)(Math.floor(num));
	}
	
	public static String sysdate(Calendar cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
	
	public static String to_char(int num) {
		return Integer.toString(num);
	}
	
	
	// 결과값은 무조건 따로 만들어서 반환해라!
	public static String trim(String str, char ch) {
		char ch2;
		String str2 = "";
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			if(ch != ch2) {
				str2 += ch2;
			}
		}
		return str2;
	}


	public static void main(String[] args) {
		System.out.println(absolute(-123));	
		
		System.out.println(primeNum(123.123));
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(sysdate(calendar));
		
		System.out.println(to_char(123456));
		
		System.out.println(trim("hello", 'h'));
		
		System.out.println(method1("zoo",1));
		
	}
}
