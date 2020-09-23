package co.jdbcapp44.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcApp44 {

	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *  from student");
		ResultSetMetaData rsmd=rs.getMetaData();
		int count=rsmd.getColumnCount();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Column Number:"+i);
			System.out.println("Column Name:"+rsmd.getColumnName(i));
			System.out.println("Column Type:"+rsmd.getColumnType(i));
			System.out.println("Column Size:"+rsmd.getColumnDisplaySize(i));
			System.out.println("-------------------------------------------");
			
		}
		

	}

}
