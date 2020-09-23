package com.jdbcapp34.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcApp34 {
public static void main(String[] args)throws Exception {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman","root","root");
PreparedStatement pst=con.prepareStatement("insert into emp1 values(?,?,?,?)");
pst.setInt(1, 111);
pst.setString(2, "AAA");
pst.setFloat(3,25000);
pst.setString(4, "Kanpur");
pst.addBatch();
pst.setInt(2, 222);
pst.setString(2, "BBB");
pst.setFloat(3,30000);
pst.setString(4, "Kanpur");
pst.addBatch();
int rowcount[]=pst.executeBatch();
for(int x:rowcount)
	System.out.println(x);




	}

}
