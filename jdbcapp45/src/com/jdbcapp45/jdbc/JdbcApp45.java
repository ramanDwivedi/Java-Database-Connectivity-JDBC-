package com.jdbcapp45.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcApp45 {

	public static void main(String[] args)throws Exception {

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp1");
		ResultSetMetaData rsmd=rs.getMetaData();
		String col1=rsmd.getColumnName(1);
		String col2=rsmd.getColumnName(2);
		String col3=rsmd.getColumnName(3);
		System.out.println(col1+"\t"+col2+"\t"+col3);
		System.out.println("------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			
		}
		
		
	}

}
