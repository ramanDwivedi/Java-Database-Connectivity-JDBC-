package com.jdbcapp41.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JdbcApp41 {

public static void main(String[] args)throws Exception {
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
CallableStatement cst=con.prepareCall("call{getSal(?,?)}");
cst.setInt(1, 111);
cst.registerOutParameter(2, Types.FLOAT);
cst.execute();
System.out.println("Salary:"+cst.getFloat(2));
		

	}

}
