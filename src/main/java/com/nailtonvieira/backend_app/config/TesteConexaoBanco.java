package com.nailtonvieira.backend_app.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class TesteConexaoBanco implements CommandLineRunner {
    
    @Autowired
    private DataSource dataSource;
    
    @Override
    public void run(String... args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("✅ Conexão com Neon PostgreSQL estabelecida com sucesso!");
          
        } catch (Exception e) {
            System.err.println("❌ Erro na conexão: " + e.getMessage());
        }
    }
}
