package com.jdbc.jdbcapp04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp04 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the salary range:");
		float sal_range=Float.parseFloat(br.readLine());
		String sql="delete from raman where esal="+sal_range;
		int rowset=st.executeUpdate(sql);
		System.out.println("Record Deleted:"+rowset);
		con.close();
		
		}

}
