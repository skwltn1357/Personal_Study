import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Study_02 {
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
 		
 	6. encrypt �Լ�
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
	
	
	// ������� ������ ���� ���� ��ȯ�ض�!
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
