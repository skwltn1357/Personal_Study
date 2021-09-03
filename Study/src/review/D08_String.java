package review;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class D08_String {

	public static <languages> void main(String[] args) {
		String str = new String("abcdefg");	//���� �ν��Ͻ� ������ �̷��� �ؾ�������
		String str2 = "hello";	//String�� ���ܷ� �ν��Ͻ��� �̷��� ������ �� �ִ�
		
		
		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] splitted = fruits.split("/");
		for(int i = 0; i < splitted.length; ++i) {
			System.out.println(i + ": " + splitted[i]);
		}
		
		// String.join(delimiter, �̾���̰������...) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�
		String after = String.join(", ", splitted);
		System.out.println(after);
		System.out.println(String.join("-", "����","���","����","�췰","����"));
		
		printRabbitWithMessage("Ŀ��","����","�ֽ�","���","�Ǹ�");
		printRabbitWithMessage("����","����");
		
		// substring(start) : ���ڿ��� start���� ���������� �ڸ� �ν��Ͻ��� ��ȯ
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ
		String sn = "991231-1234567";
		
		String year = sn.substring(0, 2); //0~1
		String month = sn.substring(2, 4);	//2~3
		String date = sn.substring(4, 6);	//4~5
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ��� �˻��Ѵ�
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���?" + ph.contains("1234"));
		System.out.println("ph�� 4321�� ���ԵǾ� �ֳ���?" + ph.contains("4321"));
		
		// startWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("ph 4�� ��������?" + ph.endsWith("4"));
		
		// replace(old,new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("���� : " + ph + ", ��� : " + result);
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ ���� �غ�)
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes()));
		
		// � ��Ģ(���ڵ� Ÿ��)�� ����� byte[]�� ��ȯ���� ������ �� �ִ�
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-8")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-16")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("EUC-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(new String(message));
		
		// trim() : ���ڿ� �ٱ����� ������ ������ �ν��Ͻ��� ��ȯ�Ѵ�
		String user_input = "\t	 java \n";
		String answer = "java";
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		String text = "hello, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		
		// indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		// indexOf(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε���(��ġ)�� ��ȯ�Ѵ�
		String languages = "Java, Python, C, C++, Kotlin, JavaScript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java",1));
		
		// ���� ���� : languages���� "Java"��� ���ڿ��� ��� �ε����� ã�� ��
		//			������ �ڷ� �÷��ǿ� �����Ͽ� ����غ�����
		System.out.println(languages);
		
		ArrayList<Integer> indexes = new ArrayList<>();
		String search = "Java";
		
		int found = -1;
		while((found = languages.indexOf(search, found + 1)) != -1) {
			indexes.add(found);
		}
		
//		for(int start = 0; start < languages.length();) {
//			int index = languages.indexOf(search, start);
//			
//			if(index == -1) {
//				break;
//			}
//			
//			System.out.println("�̹��� ã�� : " + index);
//			indexes.add(index);
//			start = index + 1;
//		}
		
		System.out.println("ã���� : " + indexes);
		
	}
	
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	// * �������ڴ� �׻� �޼����� �������� ������� �Ѵ� 
	static void printRabbitWithMessage(String...msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >)");
		System.out.println(Arrays.toString(msgs));
	}
}







