package reviewQuiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay {
	/*
	 	� �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.  
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������
	 */
	public static void main(String[] args) {
		
		int year = 2021;		
		printEventOfYear(year);
	}
	
	public static Calendar getFirstEventDay(int year) {
		Calendar event = Calendar.getInstance();
		event.set(year, 0, 1);	//1������ 1�Ͼ�
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
//		while(event.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
//			event.add(Calendar.DATE, 1);
//		}
//		
		if(event.get(Calendar.YEAR) != year) {
			event.add(Calendar.DATE, 7);
		}
		
		return event;
	}
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y�� �̺�Ʈ] M�� d��\tE����");
		Calendar event = getFirstEventDay(year);

		int count = 0;
		
		while(event.get(Calendar.YEAR) == year) {
			event.add(Calendar.DATE, 7);
			
			if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
		}
		System.out.println("������ �̺�Ʈ�� �� " + count + "ȸ �Դϴ�.");
	}
}













