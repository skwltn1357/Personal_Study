package reviewQuiz;

import java.util.Random;

/*
	����ڷκ��� ���ڸ� �Է¹����� �ش� ������ŭ�� ���� ������ �����Ѵ�
	(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
	
	�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
	
*/
public class B11_CountRandomFruits_jisu {

	public static int fruit(int num) {
		int fruit_num = 0;
		String[] fruits = {"apple","banana","kiwi","orange","grape","peach"};
		
		for(int i=0; i<num; ++i) {
			int random_num = (int)(Math.random() * fruits.length);
			System.out.println(fruits[random_num]);
			fruit_num++;
		}

		return fruit_num;
	}
	
	public static void main(String[] args) {
		System.out.println(fruit(4));
	}
}
