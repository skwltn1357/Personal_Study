package study2.day1;

import java.util.ArrayList;

public class MajorCheck {
	ArrayList<Student> s_list;
	
	//1. 생성자로 ArrayList<Student> s_list를 받는다
	public MajorCheck(ArrayList<Student> s_list) {
		this.s_list = s_list;
	}
	
	//2. s_list의 내용을 출력해주는 함수
	void method2() {
		for(int i=0; i<s_list.size(); ++i) { 
			System.out.println(s_list.get(i));
		}
	}
	
	public static void main(String[] args) {
		StudentDAO sd = new StudentDAO();
		MajorCheck m = new MajorCheck(sd.method2());
		m.method2();
	}
}
