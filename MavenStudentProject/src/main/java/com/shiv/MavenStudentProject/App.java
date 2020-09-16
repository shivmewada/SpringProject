package com.shiv.MavenStudentProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver are Loaded!");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiv", "shiv", "shiv");
			System.out.println("Connection successfullt DB");
			// here shiv is database name, shiv is username and password=shiv

			// **************Insert **********

			System.out.println("Insert your record");
			PreparedStatement ps = con.prepareStatement("insert into student(sname) values(?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("enter name:");
				String name = br.readLine();
				ps.setString(1, name);

				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				System.out.println("Do you want to continue: y/n");
				String s = br.readLine();
				if (s.startsWith("n")) {
					break;
				}
			} while (true);
			// **************show Record***********

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			// **************Update record**********s

			System.out.println("Update your record");
			System.out.println("enter Sid:");
			int d1 = Integer.parseInt(br.readLine());

			System.out.println("Enter the name :");
			String s = br.readLine();

			ps = con.prepareStatement("update student set sname=? where sid=?");

			ps.setString(1, s);// 1 specifies the first parameter in the query i.e. name
			ps.setInt(2, d1);
			int i = ps.executeUpdate();
			System.out.println("Update successfully");

			// *************Delete Record************

			System.out.println("Delete Record");
			System.out.println("enter Sid:");
			int d = Integer.parseInt(br.readLine());

			ps = con.prepareStatement("delete from student where sid=?");

			ps.setInt(1, d);

			int is = ps.executeUpdate();
			System.out.println(i + " records deleted");

			// *****************************show the
			// Record******************************************

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			con.close();

		} catch (Exception e) {
			System.out.println("Database not connected " + e);
		}

	}
}
