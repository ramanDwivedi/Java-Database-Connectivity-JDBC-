package jdbcapp28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Jdbcapp28 {
public static void main(String[] args) {
		try(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raman", "root", "root");
				PreparedStatement pst = con.prepareStatement("update emp1 set esal = esal + ? where esal < ?");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				) 
		{
			System.out.print("Bonus Amount :");
			int bonus_Amt = Integer.parseInt(br.readLine());
			System.out.print("Salary Range :");
			float sal_Range = Float.parseFloat(br.readLine());
			pst.setInt(1, bonus_Amt);
			pst.setFloat(2, sal_Range);
			int rowCount = pst.executeUpdate();
			System.out.println("Records Updated :"+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}

}

}
