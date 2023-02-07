package gui;

import javax.swing.JOptionPane;

import clientes.Cliente;
import contas.Conta;
import funcionarios.Funcionarios;
import funcionarios.Gerente;

public class ClassMain {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Cliente cliente = new Cliente();

		conta1.depositar(100.00);
		conta1.sacar(50.00);

		// System.out.println(conta1.getSaldo());
		/*
		 * contaCorrent.getTitular="Duker"; contaCorrent.getTitular();
		 * contaCorrent.getTitular().cpf="000.000.000-00"; contaCorrent.numero= 5555;
		 * contaCorrent.saldo= 10.00;
		 * 
		 * contaCorrent.sacar(500.00);
		 */

		Gerente gerente = new Gerente();
		gerente.setSalario(5000.00);
		System.out.println(gerente.getBonificacaoSalario());
		

		Funcionarios funcionario = new Funcionarios();
		funcionario.setSalario(1000.00);
		System.out.println(funcionario.getBonificacaoSalario());

	}

}
