package com.project_db.SQL_Servers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {

			String sql = "SELECT Nome_Produto FROM dbo.Solicitacoes";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String nomeProduto = rs.getString("Nome_Produto");
				System.out.println("Nome_Produto: " + nomeProduto);
			} else {
				System.out.println("Produto não encontrado");
			}

			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.err.println("Falha ao encontrar o produto");
			System.err.println("Mensagem: " + e.getMessage());
			// TODO: handle exception
		}
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)){
			
			String sql = "SELECT Nome_Solicitante FROM dbo.Solicitacoes";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				String nomeSolicitante = rs.getString("Nome_Solicitante");
				System.out.println("Nome_Solicitante: " + nomeSolicitante);
			} else {
				System.out.print("Solicitante não encontrado");
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.err.println("Falha ao encontrar o Silicitante");
			System.err.println("Mensagem: " + e.getMessage());
			// TODO: handle exception
		}
	}
}