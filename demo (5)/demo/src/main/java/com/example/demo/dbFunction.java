package com.example.demo;

import java.sql.Connection;
public class dbFunction {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);

        } catch (Exception e) {
            // System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name) {
        Statement statement;

        try {
            String query = "create table " + table_name + " (id SERIAL, language varchar(200), code varchar(220));";


            statement = conn.createStatement();
            statement.executeUpdate(query);
            // System.out.println("Table Created");
        } catch (Exception e) {
            // System.out.print(e);
        }
    }



}
