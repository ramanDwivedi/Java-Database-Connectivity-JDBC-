package com.jdbc.jdbcapp06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp06 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		String sql="drop table emp1";
		int rowset=st.executeUpdate(sql);
		System.out.println("table drop:"+rowset);
		con.close();




	}

}
