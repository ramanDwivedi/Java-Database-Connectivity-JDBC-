package com.jdbcapp47.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp47 {

	public static void main(String[] args)throws Exception {
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("select * from student");
		System.out.println("Records In Forword Direction");
		System.out.println("SID\tSNAME\tSADDR");
		System.out.println("--------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		System.out.println("Records In Backword Direction");
		System.out.println("SID\tSNAME\tSADDR");
		System.out.println("--------------------");
        while(rs.previous())
        {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	
        }

		
		

	}

}
