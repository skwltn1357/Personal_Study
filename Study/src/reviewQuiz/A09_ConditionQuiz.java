package reviewQuiz;

public class A09_ConditionQuiz {
	
	public static void main(String[] args) {
		
		int a=0 , b = 0 , c = 0, d = 0, e = 0;
		int hour = 0;
		int year = 0;
		int minsuAge = 0;
		int cheolsuAge = 0;
		int minsuBirth= 0;
		int cheolsuBirth= 0;
		boolean powerOn = true;
		String str = "yes";
		
		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(hour < 24 && hour >= 12);
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println(cheolsuAge + 2 == minsuAge);
	//	System.out.println(cheolsuBirth == minsuBirth); 
		System.out.println(!powerOn);
		
		
		String str2 = "yes";
		String str3 = new String("yes");
		
		// ������ ������ == �񱳴� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�.
		System.out.println("str == \"yes\" : " + (str == "yes"));
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� equals()�� �̿��� ���ؾ� �մϴ�.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�
		// �빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü��  heap�� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, �ű⿡ .�� ��� ��ü �����͸� ������ �� �ִ�.
		
		
		
	}

}
