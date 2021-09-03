package study2.day3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class TodayMenu {
	/*
	 	1) �����ڷ� ArrayList<Restaurant>�� �޾ƿ´�
	 	2) ������ �ָ��� ��� "�ָ��Դϴ�" ���
	 	3) ������ ���ڰ� ¦���� ��� �н�,�߽��� ������ �� ������ �޴����� �������� ��� ���
	 		ex) 2021-08-26�� ��� "�н�", "�߽�"�� ������ ������ ������ ����Ʈ���� �������� �����
	 	4) ������ ���ڰ� Ȧ���� ��� "�ѽ�","�Ͻ�"�� ������ ������ ������ ����Ʈ���� �������� �����
	 */
	
	ArrayList<Restaurant> r_list;
	
	public TodayMenu(ArrayList<Restaurant> r_list) {
		this.r_list = r_list;
		//Holiday();
		method3();
		//method4();
	}
	
	//r_list ���
//	void method2() {
//		for(int i=0; i<r_list.size(); ++i) {
//			System.out.println(r_list.get(i));
//		}
//	}
	
	void Holiday() {
		Calendar holiday = Calendar.getInstance();
		if(holiday.get(Calendar.DAY_OF_WEEK) == 7 || holiday.get(Calendar.DAY_OF_WEEK) == 8) {
			System.out.println("�ָ��Դϴ�");
		}
	}
	
	void method3() {	
		String str = "";
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE) + "��");
		
		if(cal.get(Calendar.DATE) % 2 != 0) {
			for(int i=0; i<r_list.size(); ++i) {
				str = r_list.get(i).r_type;
				if(str.contains("�н�") || str.contains("�߽�")) {
					r_list.remove(r_list.get(i));
					--i;
				}
			}
			System.out.println(r_list);
		}
	}
	
	void method4() {		
		Calendar cal = Calendar.getInstance();
		System.out.println("������ ��¥ : " + cal.get(Calendar.DATE)+"��");
		
		if(cal.get(Calendar.DATE) % 2 != 0) {
			for(int i=0; i<r_list.size(); ++i) {
				if(r_list.get(i).r_type.equals("�ѽ�") || r_list.get(i).r_type.equals("�Ͻ�")) {
					r_list.remove(r_list.get(i)); //���ΰ� ������ ����1��
					--i;
			}
		}
			int ran = (int)(Math.random() * r_list.size()); //��ġ�ٲٱ�
			r_list.get(ran);
			System.out.println(r_list.get(ran));
			System.out.println(r_list);
		}
	}
		
	public static void main(String[] args) {
		new TodayMenu(new RestaurantDAO().method1());
	}
}
