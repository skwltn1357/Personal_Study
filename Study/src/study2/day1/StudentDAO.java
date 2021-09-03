package study2.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	
	//1) SQL문을 이용해 모든 Student의 정보를 ArrayList<Student>로 받아 반환하는 함수
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

	// 2) 전공이 컴퓨터공학과이고 학번이 16학번 이상인 경우 전공을 응용컴퓨터공학과로 바꿔준다(DB에도 반영해야함)
	ArrayList<Student> method2() {
		ArrayList<Student> s_list = method1();
		System.out.println(s_list);
		
		for(int i=0; i<s_list.size(); ++i) {
			if(s_list.get(i).s_number >= 160000 && s_list.get(i).s_major.equals("컴퓨터공학과")) {
				s_list.get(i).s_major = "응용컴퓨터공학과";
			}
		}
				
		return s_list;
	}
}
