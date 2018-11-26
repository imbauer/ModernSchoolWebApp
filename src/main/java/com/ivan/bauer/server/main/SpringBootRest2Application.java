package com.ivan.bauer.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;


@SpringBootApplication(scanBasePackages = {"com.ivan"})
public class SpringBootRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest2Application.class, args);
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;
		}

		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:postgresql://192.168.99.100:5432/postgres", "user",
					"password");

			stmt = connection.createStatement();

			String strSelect = "SELECT firstname, surname, age FROM postgres.records.customers";
			System.out.println("The SQL query is: " + strSelect); // Echo For debugging
			System.out.println();
			ResultSet rset = stmt.executeQuery(strSelect);

			System.out.println("The records selected are:");
			int rowCount = 0;
			while(rset.next()) {   // Move the cursor to the next row, return false if no more row
				String firstname = rset.getString("firstname");
				String surname = rset.getString("surname");
				int    age   = rset.getInt("age");
				System.out.println(firstname + ", " + surname + ", " + age);
				++rowCount;
			}
			System.out.println("Total number of records = " + rowCount);

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}




		System.out.println("---------- DATABASE ----------");
		System.out.println(connection);
		System.out.println("---------- DATABASE ----------");

	}
}
