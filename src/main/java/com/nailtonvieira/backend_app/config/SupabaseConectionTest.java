package com.nailtonvieira.backend_app.config;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SupabaseConectionTest {

    // Altere conforme suas credenciais do Supabase
    
    private static final String URL = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:5432/postgres";

    private static final String USER = "postgres.bvaoskurspnbeqrnfuco";

    private static final String PASSWORD = "BANCO153SUPABASE";

    public static void main(String[] args) {
        System.out.println("🔍 Testando conexão com Supabase...");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conexão bem-sucedida com o banco Supabase!");
            } else {
                System.out.println("⚠️ Não foi possível abrir conexão.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Erro ao conectar ao banco: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
