package com.jdbc.jdbcapp03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp03 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Bonus Salary:");
		float Bonus=Float.parseFloat(br.readLine());
		System.out.println("Enter the salary range:");
		float sal_range=Float.parseFloat(br.readLine());
		String sql="update raman set esal=esal+"+Bonus+" where esal<"+sal_range;
		int rowcount=st.executeUpdate(sql);
		System.out.println("Employee Updated:"+rowcount);
		con.close();
		
		


		

	}

}
