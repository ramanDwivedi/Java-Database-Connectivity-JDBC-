package com.jdbcapp48.jdbc;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class JdbcApp48 {

	public static void main(String[] args)throws Exception {
		RowSet rsf=(RowSet) RowSetProvider.newFactory();
		JdbcRowSet jrs=((RowSetFactory) rsf).createJdbcRowSet();
		CachedRowSet crs=((RowSetFactory) rsf).createCachedRowSet();
		WebRowSet wrs=((RowSetFactory)rsf).createWebRowSet();
		JoinRowSet jnrs=((RowSetFactory) rsf).createJoinRowSet();
		FilteredRowSet frs=((RowSetFactory) rsf).createFilteredRowSet();
		System.out.println(jrs.getClass().getName());
		System.out.println(crs.getClass().getName());
		System.out.println(wrs.getClass().getName());
		System.out.println(jnrs.getClass().getName());
		System.out.println(frs.getClass().getName());
		
		
		
		
		

	}

}
