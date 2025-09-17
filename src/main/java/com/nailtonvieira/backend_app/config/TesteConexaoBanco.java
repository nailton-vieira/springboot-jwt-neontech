package com.nailtonvieira.backend_app.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexaoBanco {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://ep-odd-star-ac2dkppv-pooler.sa-east-1.aws.neon.tech/bdneon?user=bdneon_owner&password=npg_tKjGBfL02JFd&sslmode=require&channelBinding=require";
       // String user = "postgres";
        //String password = "senha";
        
        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connected to PostgreSQL successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}