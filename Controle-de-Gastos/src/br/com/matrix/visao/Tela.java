package br.com.matrix.visao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListCellRenderer;

import br.com.matrix.conexaoJdbc.ConexaoJdbc;
import br.com.matrix.dao.ComprasDao;
import br.com.matrix.dao.UsuarioDao;
import br.com.matrix.modelo.CompraUsuario;
import br.com.matrix.modelo.Compras;
import br.com.matrix.modelo.Usuario;

public class Tela {

	public static void main(String[] args) {
		/*
		 * ConexaoJdbc conexao= new ConexaoJdbc(); conexao.getConnection();
		 */

		UsuarioDao usuDao = new UsuarioDao();
		Usuario usuario = new Usuario();

		usuario.setNome("admin");
		usuario.setSenha("12345");

		// usuDao.salvar(usuario);

		List<Usuario> list = usuDao.listar();
		for (Usuario usuarios : list) {

		}
		System.out.println(list + "\n");

		/*
		 * usuDao.buscar(1L); usuario.setNome("AdaJunior"); usuario.setSenha("55555");
		 * usuDao.alterar(usuario);
		 */

		UsuarioDao usDao = new UsuarioDao();
		usuario = usDao.buscar(1L);
		// usuario.setSenha("admin");
		//usDao.deletar(1L);
		
		Compras compras= new Compras();
		compras.setComprasRealizada("Televisao");
		compras.setLocalCompras("Big");
		compras.setDataComprasString("15/02/2023");
		compras.setValorCompras("2300,00");
		compras.setUsuarioId(3L);
		ComprasDao comprasDao= new ComprasDao();
		//comprasDao.salvarCompras(compras);
		
		List<CompraUsuario> listarCompras= comprasDao.listarCompras(2L);
		for (CompraUsuario compraUsuario : listarCompras) {
			System.out.println(listarCompras);
			System.out.println("=========================================");
			
		}
		
		

	}

}
