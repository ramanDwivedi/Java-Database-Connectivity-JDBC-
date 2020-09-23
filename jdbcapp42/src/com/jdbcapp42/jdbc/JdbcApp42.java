package com.jdbcapp42.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcApp42 {

	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("DB.Properties");
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String pwd=p.getProperty("pwd");
		Connection con=DriverManager.getConnection(url, user, pwd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		System.out.println("SID\tSNAME\tSADDR");
		System.out.println("------------------");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			
		}

	}

}
