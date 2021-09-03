package review;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
/*
 	# ����ǥ���� (Regular Expression)
 	
 	 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
 	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
 	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
 	 
 	 # Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
 	 
 	  - Pattern
 	  - Matcher
 */
	
	public static void main(String[] args) {
		
		//Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijk]", "sleek"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijkABCDEFG]", "sleek"));
		
		/*	
		 	[abc] : �ش� �ڸ��� a,b,c�� ���
		 	[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
		 	[a-z] : a���� z���� ��� ���
		 	[A-Z] : A���� Z���� ��� ���
		 	[\\-] : ���ڷμ� -�� ��� (Escape)
		 	[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ��� (������) 
		 */
		
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));	//false
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]eep","sceep"));
		
		
		/*
		 	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 	
		 	 .  : ��� ����(���� ����)
		 	 \d : ��� ���� [0-9]
			 \D : ���ڸ� ������ ��� �� [^0-9]
			 \s : ��� ���� (\t, \n, \r, ' ')
			 \S : ������ ������ ��� ��
			 \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
			 \W : \w�� ������ ��� ��
		 */
		
		System.out.println(Pattern.matches("s.eep", "s3eep"));
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));	
		
		
		/*
		 	# �ش� ������ ����� ������ ������ �����ϴ� ���
		 		
		 	 [.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
		 	 [.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		 	 [.]? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�	(�ȳ����ų� �ѹ� ���;ߵ�)
		 	 [.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
		 	 [.]* : ���� ������ 0�� �̻� ���;� �Ѵ� (���͵��ǰ� �ȳ��͵���)
		 */
		System.out.println(Pattern.matches("[.]{5}", "....."));
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println(Pattern.matches("[.]{2,5}", "..")); // 2��~5������ true
		System.out.println(Pattern.matches("s?heep", "sheep")); // true
		System.out.println(Pattern.matches("s?heep", "kheep")); // false
		System.out.println(Pattern.matches("s+heep", "ssssssssheep"));	//true
		System.out.println(Pattern.matches("s+heep", "heep"));	//false
		
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}","010-1234-1234"));	
		System.out.println(Pattern.matches("010(-?\\d{4}){2}","01012341234"));	
		System.out.println(Pattern.matches("010-?[1-9]\\d{3}-?\\d{4}","01012341234"));
	
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		String sn = "001212-3456789";
		System.out.println(Pattern.matches("\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}",sn));
	
		// �������� : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?","gcc123@gmail.co.kr"));
	
		
		// Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("an");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while(matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + "����" + matcher.end() + "����");
		}
		
		
	}

}


































