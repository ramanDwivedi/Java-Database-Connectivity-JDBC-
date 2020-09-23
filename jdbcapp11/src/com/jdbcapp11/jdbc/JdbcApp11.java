package com.jdbcapp11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp11 {

	public static void main(String[] args) {
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			st=con.createStatement();
			String sql="update emp1 set esal=esal+100";
			ResultSet rs=st.executeQuery(sql);
			int rowcount=st.getUpdateCount();
			System.out.println("record updated:"+rowcount);
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
