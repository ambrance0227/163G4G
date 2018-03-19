package com.qh.qhit.g4.zzh.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Test {
	private static Connection con;
	private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:@localhost:1521:orcl";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	public static Connection getConnection(){
		
		try {
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			Statement st = con.createStatement();
			String sql = "select * from dept";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getInt("did"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("tel"));
				System.out.println(rs.getString("ress"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void close(Statement statement,Connection con){
		try {
			statement.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
