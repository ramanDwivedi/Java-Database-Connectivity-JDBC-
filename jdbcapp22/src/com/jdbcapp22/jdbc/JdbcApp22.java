package com.jdbcapp22.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp22 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from emp1");
		while(rs.next())
		{
			float esal=rs.getFloat(3);
			if(esal<100000)
			{
				float new_sal=esal + 1000;
				rs.updateFloat(3, new_sal);
				rs.updateRow();
			}
		}
		con.close();





	}

}
