package com.jdbc.jdbcapp09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp09 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=con.createStatement();
		String sql="select * from emp1";
		boolean b=st.execute(sql);
		ResultSet rs=st.getResultSet();
		System.out.println(b);
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("----------------------");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getFloat(3)+"\t");
			System.out.println(rs.getString(4)+"\t");
}
		con.close();

}

}
