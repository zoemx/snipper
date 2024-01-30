package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DbFunction db = new DbFunction();
		Connection conn = db.connect_to_db("snipper", "postgres", "postgres");
		db.createTable(conn, "snippets");
	}

}

