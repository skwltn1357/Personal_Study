package reviewQuiz;

import java.util.ArrayList;

public class D01_StudentList_������Ǯ�� {
	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� ����
	 	2. ������ ��/��/��
	 	3. 30���� ��� ������ ���
	 	4. 30�� �� ���� ������ ���� �л��� 	������ ���
	 */
	
	public static void main(String[] args) {
		
		ArrayList<D01_Student> student_list = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i) {
			student_list.add(new D01_Student());
		}
		
		for(D01_Student student : student_list) {
			System.out.println(student);
		}

		System.out.println("���� ���� ���� : " + D01_Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + D01_Student.best_avg_snum);
	}
}
