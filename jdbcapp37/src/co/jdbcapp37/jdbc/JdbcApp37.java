package co.jdbcapp37.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class JdbcApp37 {

	public static void main(String[] args)throws Exception {
		OracleConnectionPoolDataSource  ds=new OracleConnectionPoolDataSource();
		ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUser("system");
		ds.setPassword("root");
		PooledConnection pc=ds.getPooledConnection();
		Connection con=pc.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		System.out.println("EID ENAME ESAL");
		System.out.println("---------------");
		while(rs.next())
	    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			
}

}
