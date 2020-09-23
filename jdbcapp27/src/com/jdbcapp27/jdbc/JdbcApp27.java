package com.jdbcapp27.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcApp27 {

	public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
              PreparedStatement pst = con.prepareStatement("insert into emp1 values(?,?,?,?)");
		Scanner scanner = new Scanner(System.in);
				)
		{
		while(true) {
			System.out.print("Employee Id :");
			int eno = scanner.nextInt();
			System.out.print("Employee Name :");
			String ename = scanner.next();
			System.out.print("Employee Salary :");
			float esal = scanner.nextFloat();
			System.out.print("Employee Address :");
			String eaddr = scanner.next();
			pst.setInt(1, eno);
			pst.setString(2, ename);
			pst.setFloat(3, esal);
			pst.setString(4, eaddr);

			pst.executeUpdate();
			System.out.println("Employee Inserted Successfully");
			System.out.print("One more Employee[yes/no]? :");
			String option = scanner.next();
			if(option.equals("yes")) {
				continue;
			}
			else 
			break;

			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}




}

		





	}


