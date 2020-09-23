package com.jdbcapp19.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp19 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from emp1");
		rs.moveToInsertRow();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Employee Id:");
			String eid=br.readLine();
			System.out.println("Employee Name:");
			String ename=br.readLine();
			System.out.println("Employee Salary:");
			Float esal=Float.parseFloat(br.readLine());
			System.out.println("Employee Address:");
			String eaddr=br.readLine();
			rs.updateString(1,eid);
			rs.updateString(2,ename);
			rs.updateFloat(3,esal);
			rs.updateString(4,eaddr);
			rs.insertRow();
			System.out.println("Employee Inserted Successfully");
			System.out.println("One More Employee[yes/no]:");
			String option=br.readLine();
			if(option.equalsIgnoreCase("no"))
					break;
			}
}

}
