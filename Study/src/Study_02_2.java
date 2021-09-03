import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Study_02_2 {
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
 */
	
	public static int method1(int num) {
		return (Math.abs(num));
	}
	
	public static int method2(double num) {
		return (int)(Math.floor(num));
	}
	
	public static String method3(Calendar cal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
	
	public static String method4(int num) {
		return Integer.toString(num);
	}
	
	public static String method5(String str, char ch) {
		char ch2;
		String st = "";
		
		for(int i=0; i<str.length(); ++i) {
			ch2 = str.charAt(i);
			if(ch2 != ch) {
				st += ch2;
			}
		}
		return st;
	}
	
	public static void main(String[] args) {
		System.out.println(method1(-1234));
		System.out.println(method2(11.244));

		Calendar cal = Calendar.getInstance();
		System.out.println(method3(cal));
		
		System.out.println(method5("hello",'h'));
		
		
	}
	
}
