package reviewQuiz;

import java.util.Scanner;

public class D09_BruteForce_�л�Ǯ��1 {
	/*
	 	# ��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ����غ�����
	 	
	 		- ���� ��/�ҹ���
	 		- ����
	 		- Ư������(shift������ �����Ѱ͵�)
	 		
	 		ex : 4 �Է� -> 0000 ~ zzzz
	 */
	
	public static String pw = "abcdeefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
	public static int cnt = pw.length();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len; // �Է¹޴� ��й�ȣ ����.

		System.out.print("��й�ȣ ���� �Է� : ");
		len = sc.nextInt();
		// System.out.println("length: " + len);

		int[] count = new int[len]; // ���̺� �� ��° ���ڸ� ������� �����صδ� �迭.
		boolean[] check = new boolean[len]; // 3�ڸ� �̻��� �� ���� �ڸ����� �����ڸ����� �ٲ𶧱��� ��� 0���� ������ �������ϱ�.. üũ���ִ� ��.

		while (count[0] != cnt) {
			for (int i = 0; i < len; i++) {
				System.out.print(pw.charAt(count[i] % cnt));
			}
			System.out.print("\n");

			count[len - 1]++;
			for (int j = len - 2; j >= 0; j--) {
				if (count[j + 1] != 0 && count[j + 1] % cnt == 0 && check[j] == false) {
					count[j]++;
					check[j] = true;
				} else if (count[j + 1] != 0 && count[j + 1] % cnt != 0 && check[j] == true) {
					check[j] = false;
				}
			}
		}
	}
	
}
