package study2.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCP {
	
	private static HikariConfig config;
	private static HikariDataSource datasource;
	
	static {
		config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XE");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("maximumPoolSize", 20);
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
	
		datasource = new HikariDataSource(config);
	}
	
	public static Connection getConnection() throws SQLException {
		return datasource.getConnection();
	}
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig();
        
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XE");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		
		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT * FROM employees";
		
		try (
			Connection conn = ds.getConnection();	
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			ResultSetMetaData meta = rs.getMetaData();
			
			int COLUMN_SIZE = meta.getColumnCount();
			
			while(rs.next()) {
				for(int i=1; i<= COLUMN_SIZE; ++i) {
					System.out.printf("%s\t", rs.getObject(i));
				}
				System.out.println();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
