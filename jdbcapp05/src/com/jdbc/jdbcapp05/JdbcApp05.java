package com.jdbc.jdbcapp05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp05 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		String sql="create table emp1(eno number(5))";
		int rowset=st.executeUpdate(sql);
		System.out.println("table created:"+rowset);
		con.close();
}

}
