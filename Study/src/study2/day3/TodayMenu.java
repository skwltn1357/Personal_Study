package study2.day3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class TodayMenu {
	/*
	 	1) 생성자로 ArrayList<Restaurant>를 받아온다
	 	2) 오늘이 주말인 경우 "주말입니다" 출력
	 	3) 오늘의 일자가 짝수인 경우 분식,중식을 제외한 뒤 나머지 메뉴에서 랜덤으로 골라 출력
	 		ex) 2021-08-26인 경우 "분식", "중식"을 제외한 나머지 음식점 리스트에서 랜덤으로 골라줌
	 	4) 오늘의 일자가 홀수인 경우 "한식","일식"을 제외한 나머지 음식점 리스트에서 랜덤으로 골라줌
	 */
	
	ArrayList<Restaurant> r_list;
	
	public TodayMenu(ArrayList<Restaurant> r_list) {
		this.r_list = r_list;
		//Holiday();
		method3();
		//method4();
	}
	
	//r_list 출력
//	void method2() {
//		for(int i=0; i<r_list.size(); ++i) {
//			System.out.println(r_list.get(i));
//		}
//	}
	
	void Holiday() {
		Calendar holiday = Calendar.getInstance();
		if(holiday.get(Calendar.DAY_OF_WEEK) == 7 || holiday.get(Calendar.DAY_OF_WEEK) == 8) {
			System.out.println("주말입니다");
		}
	}
	
	void method3() {	
		String str = "";
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		if(cal.get(Calendar.DATE) % 2 != 0) {
			for(int i=0; i<r_list.size(); ++i) {
				str = r_list.get(i).r_type;
				if(str.contains("분식") || str.contains("중식")) {
					r_list.remove(r_list.get(i));
					--i;
				}
			}
			System.out.println(r_list);
		}
	}
	
	void method4() {		
		Calendar cal = Calendar.getInstance();
		System.out.println("▶오늘 날짜 : " + cal.get(Calendar.DATE)+"일");
		
		if(cal.get(Calendar.DATE) % 2 != 0) {
			for(int i=0; i<r_list.size(); ++i) {
				if(r_list.get(i).r_type.equals("한식") || r_list.get(i).r_type.equals("일식")) {
					r_list.remove(r_list.get(i)); //밥사부가 나오는 이유1번
					--i;
			}
		}
			int ran = (int)(Math.random() * r_list.size()); //위치바꾸기
			r_list.get(ran);
			System.out.println(r_list.get(ran));
			System.out.println(r_list);
		}
	}
		
	public static void main(String[] args) {
		new TodayMenu(new RestaurantDAO().method1());
	}
}
