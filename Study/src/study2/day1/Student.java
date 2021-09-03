package study2.day1;

public class Student {
	/*
	 	Student 테이블의 정보를 받아오는 클래스
	 	1) 생성자로 학번, 이름, 전공을 받아온다
	 	2) getter / setter 사용 (우클릭 source)
	 */
	
	 int s_number;
	 String s_name;
	 String s_major;
	
	public Student(int s_number, String s_name, String s_major) {
		this.s_number = s_number;
		this.s_name = s_name;
		this.s_major = s_major;
	}

	public int getS_number() {
		return s_number;
	}

	public void setS_number(int s_number) {
		this.s_number = s_number;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_major() {
		return s_major;
	}

	public void setS_major(String s_major) {
		this.s_major = s_major;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%s/%s",s_number,s_name,s_major);
	}
}
