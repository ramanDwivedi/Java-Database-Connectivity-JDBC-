package com.jdbcapp31.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcApp31 {

	public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from emp1");
				) {
			ResultSetMetaData md = rs.getMetaData();
			int count = md.getColumnCount();
			System.out.println("No Of Columns :"+count);
			for(int i = 1; i <= count; i++) {
				System.out.println("Column Name :"+md.getColumnName(i));
				System.out.println("Column Type :"+md.getColumnTypeName(i));
				System.out.println("Column Size :"+md.getColumnDisplaySize(i));
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


		}
}


