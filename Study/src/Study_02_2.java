import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Study_02_2 {
	/*
 	1. abs �Լ� : ���ڸ� �Է� ������ �ش� ������ ���밪�� ��ȯ�Ѵ�
 		ex) -123 -> 123 / 123 -> 123
 	
 	2. floor �Լ� : �Ҽ��� �Է¹����� �Ҽ��� �Ʒ��� ������ ������ ��ȯ�Ѵ�
 		ex) 123.123 -> 123 / 123.1 -> 123
 	
 	3. sysdate �Լ� : �Լ��� �����ϸ� ���� ��¥�� ��ȯ�Ѵ�
 		ex) ���� -> 2021-07-13
 		
 	4. to_char �Լ� : ����Ÿ���� �Է¹����� ���ڿ��� ��ȯ�� ��ȯ�Ѵ�
 	 	ex) 123 -> 123
 	 	
 	5. trim �Լ� : ���ڿ��� ���ڸ� �Է¹޾� ���ڿ��� �ش� ���ڰ� ���ԵǾ������� �������� ��ȯ
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
