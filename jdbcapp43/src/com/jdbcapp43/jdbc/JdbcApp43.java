package com.jdbcapp43.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcApp43 {

	public static void main(String[] args)throws Exception {

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("Database Product Name:"+dbmd.getDatabaseProductName());
		System.out.println("Database Product Version:"+dbmd.getDatabaseProductVersion());
		System.out.println("Database Major Version:"+dbmd.getDriverMajorVersion());
		System.out.println("Database Minor version:"+dbmd.getDatabaseMinorVersion());
		System.out.println("Jdbc Major Version:"+dbmd.getJDBCMajorVersion());
		System.out.println("Jdbc Minor Version:"+dbmd.getJDBCMinorVersion());
		System.out.println("DriverName:"+dbmd.getDriverName());
		System.out.println("DriverVersion:"+dbmd.getDriverVersion());
		System.out.println("URL:"+dbmd.getURL());
		System.out.println("UserName:"+dbmd.getUserName());
		System.out.println("MaxColumnTable:"+dbmd.getMaxColumnsInTable());
		System.out.println("MaxRowSize:"+dbmd.getMaxRowSize());
		System.out.println("MaxStatementLength:"+dbmd.getMaxStatementLength());
		System.out.println("MaxTableInSelect:"+dbmd.getMaxTablesInSelect());
		System.out.println("MaxTableNameLength:"+dbmd.getMaxTableNameLength());
		System.out.println("SQLKeywords:"+dbmd.getSQLKeywords());
		System.out.println("NumericFunction:"+dbmd.getNumericFunctions());
		System.out.println("String Function:"+dbmd.getStringFunctions());
		System.out.println("SystemFunction:"+dbmd.getSystemFunctions());
		System.out.println("Supports Outer Join:"+dbmd.supportsFullOuterJoins());
		System.out.println("SupportsStoredProcedure:"+dbmd.supportsStoredProcedures());
		
	}

}
