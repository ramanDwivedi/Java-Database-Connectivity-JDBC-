package com.jdbcapp20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp20 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from emp1");
		System.out.println("Data Before Updation");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		while(rs.next())
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
		System.out.println("Application Is Pausing State Update Database");
		System.in.read();
		rs.beforeFirst();
		System.out.println("Data After Updation");
		System.out.println("ENO\tENAME\tESAL\tEADDR");
		System.out.println("-------------------------");
		while(rs.next())
		{
			rs.refreshRow();
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));

			}
		con.close();


}

}
