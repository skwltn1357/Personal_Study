package review;

public class B02_CharAt {
	/*
	 	# "���ڿ�".CharAt(index);
	 	- �ش� ���ڿ����� ���ϴ� ��°�� ���ڸ� charŸ������ ������ �Լ�
	 	- ù ��° ���ڴ� 0�� �ε����� �ִ�
	 	# "���ڿ�".length();
	 	- �ش� ���ڿ��� �� ����������� intŸ������ �˷��ش�
	 */
	
	public static void main(String[] args) {
		
		String text = "Hello, everyone!!";
		
		
		System.out.println(text.charAt(4)); // 4��° ����
		System.out.println(text.length()); // ���ڿ� ����
		// 0�� �ε������� 17���� ���ڰ� �ֱ� ������ 16�� �ε����� �������̴�
		System.out.println(text.charAt(text.length() - 1)); // ����������
	}

}
