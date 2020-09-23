package com.jdbcapp36.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcApp36 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			con.setAutoCommit(false);
			st = con.createStatement();
			st.executeUpdate("insert into emp1 values(111, 'AAA', 5000, 'Hyd')");
			Savepoint sp = con.setSavepoint();
			st.executeUpdate("insert into emp1 values(222, 'BBB', 6000, 'Hyd')");
			con.rollback(sp);
			st.executeUpdate("insert into emp1 values(333, 'CCC', 7000, 'Hyd')");
			con.commit();
			System.out.println("Transaction Success");
		} catch (Exception e) {
			try {
				con.rollback();
				System.out.println("Transaction Failure");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			}

}
