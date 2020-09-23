package com.jdbcapp24.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcApp24 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		PreparedStatement pst=con.prepareStatement("insert into emp1 values(?,?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Employee Id:");
			String eid=br.readLine();
			System.out.println("Employee Name:");
			String ename=br.readLine();
			System.out.println("Employee Salary:");
			float esal=Float.parseFloat(br.readLine());
			System.out.println("Employee Address:");
			String eaddr=br.readLine();
			pst.setString(1,eid);
			pst.setString(2, ename);
			pst.setFloat(3,esal);
			pst.setString(4,eaddr);
			pst.executeUpdate();
			System.out.println("Employee Inserted Successfully:");
			System.out.println("One more Employee[yes/no]:");
			String option=br.readLine();
			if(option.equals("no"))
			{
				break;
			}
			
		}



	}

}
