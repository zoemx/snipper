package com.example.demo;
import java.sql.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		dbFunction db = new dbFunction();
		Connection conn = db.connect_to_db("snipper", "postgres", "postgres");
		db.createTable(conn, "snippets");


	}

}

