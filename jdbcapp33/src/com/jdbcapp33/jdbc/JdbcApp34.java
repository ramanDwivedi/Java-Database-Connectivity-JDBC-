package com.jdbcapp33.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp34 {

	public static void main(String[] args)throws Exception {
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
			Statement st = con.createStatement();
			st.addBatch("insert into emp1 values(777, 'GGG', 6000, 'Hyd')");
			st.addBatch("update emp1 set esal = esal - 500 where esal < 10000");
			st.addBatch("delete from emp1 where eid = 111");
			int[] rowCounts = st.executeBatch();
			for(int x: rowCounts)
			System.out.println("Records Manipulated :"+x);
			


}

}
