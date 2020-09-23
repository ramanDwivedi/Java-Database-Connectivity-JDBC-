package com.jdbcapp35.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp35 {

	public static void main(String[] args) {
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			con.setAutoCommit(false);
			Statement st=con.createStatement();
			st.executeUpdate("insert into student values('s-111','AAA','hyd')");
			st.executeUpdate("insert into student values('s-444','DDD','hyd')");
			st.executeUpdate("insert into student values('s-555','EEE','hyd')");
			con.commit();
			System.out.println("Transaction Success");
		}
		catch(Exception e)
		{
try
{
	con.rollback();
	System.out.println("Transaction Failure");
}
catch(Exception e1)
{
	e1.printStackTrace();
	
}


}

	}

}
