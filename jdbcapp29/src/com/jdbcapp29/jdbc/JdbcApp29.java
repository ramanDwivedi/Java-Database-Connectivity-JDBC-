package com.jdbcapp29.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcApp29 {

	public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
				PreparedStatement pst = con.prepareStatement("delete from emp1 where esal < ?");
				Scanner scanner = new Scanner(System.in);
				) {
			System.out.print("Salary Range :");
			float sal_Range = scanner.nextFloat();
			pst.setFloat(1, sal_Range);
			int rowCount = pst.executeUpdate();
			System.out.println("Records Deleted :"+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}





		}




	}


