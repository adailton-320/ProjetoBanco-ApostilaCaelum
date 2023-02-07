package br.com.matrix.conexaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJdbc {

	private static String url = "jdbc:postgresql://localhost:5432/dbGastos";
	private static String usuario = "postgres";
	private static String senha = "12345";
	private static Connection conexao = null;

	static {
		conectar();
	}

	private static void conectar() {
		try {
			if (conexao == null) {
				Class.forName("org.postgresql.Driver");
				conexao = DriverManager.getConnection(url, usuario, senha);
				conexao.setAutoCommit(false);
				System.out.println("Banco conectado com sucesso!");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return conexao;
	}

}
