package com.jdbcapp25.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcApp25 {

	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		PreparedStatement pst=con.prepareStatement("update emp1 set esal=esal+? where esal<?");
		pst.setInt(1,500);
		pst.setFloat(2, 100000);
		int rowCount=pst.executeUpdate();
		System.out.println("Record Updated:"+rowCount);
		con.close();
		




	}

}
