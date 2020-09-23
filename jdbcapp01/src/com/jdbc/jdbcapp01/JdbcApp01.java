package com.jdbc.jdbcapp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp01 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Table Name:");
		String tname=br.readLine();
		String sql="create table " +tname+ "(eno number(5),ename varchar2(20),esal number(7,2),eaddr varchar2(20))";
		st.executeUpdate(sql);
		System.out.println("Table Created SuccessFully");
		con.close();
		

	}

}
