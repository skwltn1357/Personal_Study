package study2.day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import study2.day1.HikariCP;

public class RestaurantDAO {
	//음식점 테이블의 정보를 DB에서 가져와 Restaurant에 담아 ArrayList<Restaurant>에 넣어 리턴	

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
	
	//DB에서 애초에 한식,일식을 빼고 받아오는 함수를 사용할 수도 있음.
	}
