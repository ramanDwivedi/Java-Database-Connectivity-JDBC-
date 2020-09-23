package com.jdbcapp46.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

public class JdbcApp46 {

	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		ParameterMetaData pmd=pst.getParameterMetaData();
		int count=pmd.getParameterCount();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Parameter Number:"+i);
			System.out.println("Parameter Mode:"+pmd.getParameterMode(i));
			System.out.println("Parameter Type:"+pmd.getParameterType(i));
			System.out.println("Parameter Precision:"+pmd.getPrecision(i));
			System.out.println("Parameter Scale:"+pmd.getScale(i));
			System.out.println("Parameter isSigned:"+pmd.isSigned(i));
			System.out.println("Parameter isNullable:"+pmd.isNullable(i));
			System.out.println("----------------------------------------");
		}
		
		
		

	}

}
