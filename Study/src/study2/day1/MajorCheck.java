package study2.day1;

import java.util.ArrayList;

public class MajorCheck {
	ArrayList<Student> s_list;
	
	//1. �����ڷ� ArrayList<Student> s_list�� �޴´�
	public MajorCheck(ArrayList<Student> s_list) {
		this.s_list = s_list;
	}
	
	//2. s_list�� ������ ������ִ� �Լ�
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
