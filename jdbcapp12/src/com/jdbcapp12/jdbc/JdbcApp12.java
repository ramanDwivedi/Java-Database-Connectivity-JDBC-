package com.jdbcapp12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp12 {

	public static void main(String[] args) {
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			st=con.createStatement();
			String sql="select * from emp1";
			int rowcount=st.executeUpdate(sql);
			ResultSet rs=st.getResultSet();
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
			}
			




		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
