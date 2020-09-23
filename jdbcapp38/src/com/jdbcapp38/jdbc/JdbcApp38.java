package com.jdbcapp38.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcApp38 {

	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		File f=new File("F:\\Camera\\20160411_133506.jpg");
		FileInputStream fis=new FileInputStream(f);
		PreparedStatement pst=con.prepareStatement("insert into emp values(?,?)");
		pst.setInt(1, 100);
		pst.setBinaryStream(2,fis,(int)f.length());
		pst.executeUpdate();
		System.out.println("Employee image inserted Successfully");
		con.close();
		

	}

}
