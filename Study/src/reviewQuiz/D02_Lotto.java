package reviewQuiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Lotto {
	/*
	 	1. 1 ~ 45�� �ߺ����� ���� ���� 6�� �Ǵ� 7���� �����ϴ� �޼��带 �ۼ��غ�����
	 		(��÷��ȣ�� 7��, �մ��� ���� ��ȣ�� 6��)
	 	
	 	2. ���α׷��� ���۵Ǹ� ��÷��ȣ�� �ϳ� �����ϰ� (���� 7��)
	 		��÷��ȣ�� ��ġ�ϴ� 6���� ���ڰ� ���� �� ���� ��ȣ�� ��� �̾ƺ�����
	 		
	 	3. 1�� �Ǵ� 2� ��÷�ɶ����� ���� �󸶳� ����� ����غ����� (���� 6�� ���������� õ��)
	 */
	
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private int bonus = 0;
	
	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != len) {
			int ranNum = (int)(Math.random() * LOTTO_SIZE + 1);
			//System.out.println("Set�� " + ranNum + "�� �������ϴ�.");
			lotto.add(ranNum);
			
			if(len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}
		
		return lotto;
		
	}
	
	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();
		
		Set<Integer> win = quiz.generate(7);
		System.out.println("��÷ ��ȣ�� " + win + "�Դϴ�. �� �� ���ʽ� ��ȣ�� " + quiz.bonus + "�Դϴ�.");
		
		
		List<Integer> checkList = new ArrayList<>(7);
		
		long spent = 0;
		int count = 0;
		
		while (true) {
			Set<Integer> blackcow = quiz.generate(6);
			count++;
			
			checkList.addAll(win);
			checkList.removeAll(blackcow);
			
			if (checkList.size() == 1) {
				spent = count * 1000;
				
				if(checkList.get(0) == quiz.bonus) {
					System.out.println("1�� ��÷�Դϴ�." + count + "�� �����ϼ����� ,"
							+ "���±��� ���� ���� " + spent + "�� �Դϴ�.");
				}else {
					System.out.println("2�� ��÷�Դϴ�." + count + "�� �����ϼ����� ,"
							+ "���±��� ���� ���� " + spent + "�� �Դϴ�.");
				}
				
				break;
			}
			checkList.clear();
			
		}
	}
}







	
