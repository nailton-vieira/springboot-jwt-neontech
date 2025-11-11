package com.nailtonvieira.backend_app.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class TesteConexaoBanco {
    public static void main(String[] args) {
        
    String url = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:5432/postgres";
    String user = "postgres.bvaoskurspnbeqrnfuco";
    String password = "BANCO153SUPABASE";
        
        try (Connection conn = DriverManager.getConnection(url,user, password)) {
            System.out.println("Connected to PostgreSQL successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}