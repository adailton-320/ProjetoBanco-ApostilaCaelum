package br.com.matrix.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.matrix.conexaoJdbc.ConexaoJdbc;
import br.com.matrix.modelo.Usuario;

public class UsuarioDao {

	private Connection conexao;

	public UsuarioDao() {

		this.conexao = ConexaoJdbc.getConnection();

	}

	public void salvar(Usuario usuario) {
		String sql = "INSERT INTO tbusuario(nome, senha) VALUES (?, ?)";
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getSenha());

			statement.execute();
			conexao.commit();

			System.out.println("Cadastro realizado com sucesso");

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				conexao.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public void alterar(Usuario usuario) {
		String sql = "update tbusuario set nome=?, senha= ? where id= " + usuario.getId();
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getSenha());
			statement.execute();
			conexao.commit();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conexao.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public List<Usuario> listar() {
		List<Usuario> listUsuario = new ArrayList<>();

		String sql = "select * from tbusuario";
		PreparedStatement statement;

		try {
			statement = conexao.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Usuario usuario = new Usuario();

				usuario.setId(resultSet.getLong("id"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setSenha(resultSet.getString("senha"));

				listUsuario.add(usuario);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return listUsuario;
	}

	public Usuario buscar(Long id) {
		Usuario usuario = new Usuario();
		String sql = "select * from tbusuario where id = " + id;

		PreparedStatement statement;

		try {
			statement = conexao.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				usuario.setId(resultSet.getLong("id"));
				usuario.setNome(resultSet.getString("nome"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	public void deletar(Long id) {
		String sql = "delete from tbusuario where id=" + id;
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.execute();
			conexao.commit();

			System.out.println("Usuario deletado com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conexao.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
