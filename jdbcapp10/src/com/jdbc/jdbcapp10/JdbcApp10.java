package com.jdbc.jdbcapp10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp10 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		String sql="update emp1 set esal=esal+100 where esal<10000";
		boolean b=st.execute(sql);
		System.out.println(b);
		int rowcount=st.getUpdateCount();
		System.out.println("Record updated:"+rowcount);
		con.close();
		
		}

}
