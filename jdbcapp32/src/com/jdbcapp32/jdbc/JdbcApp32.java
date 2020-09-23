package com.jdbcapp32.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcApp32 {

	public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				) {
			ResultSetMetaData md = rs.getMetaData();
			int count = md.getColumnCount();
			for(int i = 1; i <= count; i++) {
				System.out.print(md.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println("-------------------------------------");
			while(rs.next()) {
				for(int j = 1; j <= count; j++) {
					System.out.print(rs.getString(j)+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
