package com.q4.crudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class CrudappApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}

	@Override
	public void run(String... args) {
		try (Connection conn = dataSource.getConnection()) {
			if (conn.isValid(2)) {
				System.out.println("Database connected successfully!");
			} else {
				System.out.println("Database connection failed!");
			}
		} catch (SQLException e) {
			System.out.println("Error while connecting to DB: " + e.getMessage());
		}
	}
}