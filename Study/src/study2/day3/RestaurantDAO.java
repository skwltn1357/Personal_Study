package study2.day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import study2.day1.HikariCP;

public class RestaurantDAO {
	//������ ���̺��� ������ DB���� ������ Restaurant�� ��� ArrayList<Restaurant>�� �־� ����	

	ArrayList<Restaurant> method1(){
		ArrayList<Restaurant> r_list = new ArrayList<>();
		String sql = "select * from restaurant";
		
		try(
			Connection conn = HikariCP.getConnection();	
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			
			while(rs.next()) {
				r_list.add(new Restaurant(
							rs.getString("r_name"),
							rs.getString("r_type")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r_list;
	}
	
	//DB���� ���ʿ� �ѽ�,�Ͻ��� ���� �޾ƿ��� �Լ��� ����� ���� ����.
	}
