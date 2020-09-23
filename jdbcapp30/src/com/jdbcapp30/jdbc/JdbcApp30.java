package com.jdbcapp30.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.DatabaseMetaData;

public class JdbcApp30 {

	public static void main(String[] args) {
		try(
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
) {
			DatabaseMetaData md = (DatabaseMetaData) con.getMetaData();
			System.out.println(md.getDatabaseProductName());
			System.out.println(md.getDatabaseProductVersion());
			System.out.println(md.getDriverMajorVersion());
			System.out.println(md.getDriverMinorVersion());
			System.out.println(md.getSQLKeywords());
			System.out.println(md.getStringFunctions());
			System.out.println(md.getNumericFunctions());
			System.out.println(md.supportsStoredProcedures());
			System.out.println(md.supportsBatchUpdates());
		} catch (Exception e) {
			e.printStackTrace();
		}






		}

				

	}


