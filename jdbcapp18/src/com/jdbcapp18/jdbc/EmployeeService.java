package com.jdbcapp18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeService {
	Connection con;
	Statement st;
	ResultSet rs;
	EmployeeTo eto;
	String msg;
	boolean b=false;
	public EmployeeService()
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			 st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 rs=st.executeQuery("Select * from emp1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public EmployeeTo getEmployee(String label)
		{
			try {
				if(label.equals("First")) {
					rs.first();
				msg="";
				}
				if(label.equals("Next")) {
					b=rs.next();
					if(b==false)
					{
						msg="No More Record In Forward Direction";
					}
					else
						msg="";
					}
				if(label.equals("Previous"))
					b=rs.previous();
				if(b==false)
					msg="No more Record in Backward Direction";
				else 
					msg="";
				if(label.equals("Last"))
					rs.last();
				msg="";
				eto=new EmployeeTo();
				eto.setEno(rs.getInt(1));
				eto.setEname(rs.getString(2));
				eto.setEsal(rs.getFloat(3));
				eto.setEaddr(rs.getString(4));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return eto;
		}
			public String getMsg()
			{
				return msg;
			}
			
			
			 
}
	
	


