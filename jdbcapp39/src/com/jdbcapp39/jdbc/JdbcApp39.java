package com.jdbcapp39.jdbc;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp39 {

	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		rs.next();
            System.out.println("Employee Id "+rs.getInt(1));
			InputStream is=rs.getBinaryStream(2);
			FileOutputStream fos=new FileOutputStream("java");
			int i=is.read();
			while(i!=-1)
			{
				fos.write(i);
				i=is.read();
			}
			System.out.println("Image Retrieved Successfully");
			fos.close();
			con.close();

		
		
		

	}

}
