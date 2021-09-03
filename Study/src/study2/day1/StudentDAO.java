package study2.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	
	//1) SQL���� �̿��� ��� Student�� ������ ArrayList<Student>�� �޾� ��ȯ�ϴ� �Լ�
	ArrayList<Student> method1(){
		ArrayList<Student> s_list = new ArrayList<>();
		String sql = "select * from Student";
		
		try(
			Connection conn = HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				s_list.add(new Student(
						rs.getInt("s_number"),
						rs.getString("s_name"),
						rs.getString("s_major")));
			}
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return s_list;
	}

	// 2) ������ ��ǻ�Ͱ��а��̰� �й��� 16�й� �̻��� ��� ������ ������ǻ�Ͱ��а��� �ٲ��ش�(DB���� �ݿ��ؾ���)
	ArrayList<Student> method2() {
		ArrayList<Student> s_list = method1();
		System.out.println(s_list);
		
		for(int i=0; i<s_list.size(); ++i) {
			if(s_list.get(i).s_number >= 160000 && s_list.get(i).s_major.equals("��ǻ�Ͱ��а�")) {
				s_list.get(i).s_major = "������ǻ�Ͱ��а�";
			}
		}
				
		return s_list;
	}
}
