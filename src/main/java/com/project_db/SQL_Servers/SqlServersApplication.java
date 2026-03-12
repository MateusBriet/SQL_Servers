package com.project_db.SQL_Servers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServersApplication {

    // Configurações de conexão - altere conforme seu ambiente
    private static final String URL = "jdbc:sqlserver://Briet\\SQLEXPRESS;databaseName=briet;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "sa";
    private static final String SENHA = "@mateusbriet040923";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            
            System.out.println("Conexão com SQL Server realizada com sucesso!");
            System.out.println("Banco de dados: " + conn.getCatalog());
            
        } catch (SQLException e) {
            System.err.println("Falha ao conectar no SQL Server!");
            System.err.println("Mensagem: " + e.getMessage());
            // Opcional: mostrar mais detalhes do erro
            // System.err.println("Código de erro: " + e.getErrorCode());
            // System.err.println("SQL State: " + e.getSQLState());
        }
    }
}