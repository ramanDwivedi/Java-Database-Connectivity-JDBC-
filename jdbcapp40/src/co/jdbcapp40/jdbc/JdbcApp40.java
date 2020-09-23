package co.jdbcapp40.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JdbcApp40 {

public static void main(String[] args)throws Exception {
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
CallableStatement cst=con.prepareCall("{call addproc(?,?,?)}");
cst.setInt(1, 100);
cst.setInt(2, 200);
cst.registerOutParameter(3,Types.INTEGER);
cst.execute();
System.out.println("Result.."+cst.getInt(3));

	
		

	}

}
