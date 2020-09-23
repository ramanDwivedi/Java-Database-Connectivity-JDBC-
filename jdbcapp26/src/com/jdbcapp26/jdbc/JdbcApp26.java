package com.jdbcapp26.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcApp26 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		PreparedStatement pst=con.prepareStatement("select * from emp1 where esal<?");
		pst.setFloat(1,70000.0f);
		ResultSet rs=pst.executeQuery();
		System.out.println("EID ENAME ESAL EADDR");
		System.out.println("----------------------");
      while(rs.next())
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
    	  }

}
