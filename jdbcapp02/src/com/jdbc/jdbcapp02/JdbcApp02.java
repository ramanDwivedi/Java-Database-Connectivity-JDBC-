package com.jdbc.jdbcapp02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcApp02 {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
;
		Statement st=con.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			 System.out.println("Enter employee number:");
			 int eno=Integer.parseInt(br.readLine());
			 System.out.println("Enter employee name:");
			 String ename=br.readLine();
			 System.out.println("Enter employee salary:");
			 float esal=Float.parseFloat(br.readLine());
			 System.out.println("Enter employee Address:");
			 String eaddr=br.readLine();
			 String sql="insert into raman values("+eno+",'"+ename+"',"+esal+",'"+eaddr+"')";
			 st.executeUpdate(sql);
			 System.out.println("Employee inserted successfully:");
			 System.out.println("One more employee [yes/no]:");
			 String option=br.readLine();
			if(option.equals("yes"))
			 {
				 continue;
			 }
			else
				if(option.equals("no"))
				{
					break;
				}
		
	
		}
		con.close();
		
}

}

