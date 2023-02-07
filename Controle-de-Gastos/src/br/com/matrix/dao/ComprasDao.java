package br.com.matrix.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.matrix.conexaoJdbc.ConexaoJdbc;
import br.com.matrix.modelo.CompraUsuario;
import br.com.matrix.modelo.Compras;

public class ComprasDao {
	
	
	private Connection conexao;
	
	public ComprasDao() {
		this.conexao= ConexaoJdbc.getConnection();
	}
	
	public void salvarCompras(Compras compras) {
		String sql= "INSERT INTO tbgastos (produtocomprado, localcompra, datacompra, valorcompra, usuario) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement statement= conexao.prepareStatement(sql);
			statement.setString(1, compras.getComprasRealizada());
			statement.setString(2, compras.getLocalCompras());
			statement.setString(3, compras.getDataComprasString());
			statement.setString(4,compras.getValorCompras());
			statement.setLong(5,compras.getUsuarioId());
			
			statement.execute();
			conexao.commit();
			
			System.out.println("Compras salvas com sucesso!!");
			
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
	
	public List<CompraUsuario> listarCompras(Long idUser){
		List<CompraUsuario> listarComprasUser= new ArrayList<CompraUsuario>();
		
		String sql= "select nome, produtocomprado,localcompra, datacompra, valorcompra "
				+ "from tbgastos as gastos inner join tbusuario as tbuser "
				+ "on gastos.usuario= tbuser.id where tbuser.id= "+ idUser;
		
		try {
			PreparedStatement statement= conexao.prepareStatement(sql);
			ResultSet resultSet= statement.executeQuery();
			
			while(resultSet.next()) {
				CompraUsuario compraUsuario= new CompraUsuario();
				compraUsuario.setNome(resultSet.getString("nome"));
				compraUsuario.setComprasRealizada(resultSet.getString("produtocomprado"));
				compraUsuario.setLocalCompras(resultSet.getString("localcompra"));
				compraUsuario.setDataComprasString(resultSet.getString("datacompra"));
				compraUsuario.setValorCompras(resultSet.getString("valorcompra"));
				
				listarComprasUser.add(compraUsuario);
				
				
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return listarComprasUser;
	}

	
	

}
