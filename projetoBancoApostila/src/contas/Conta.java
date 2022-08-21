package contas;

import javax.swing.JOptionPane;

import clientes.Cliente;

public class Conta {
	
	private Cliente titular;
	private int agencia;
	private int numero;
	private double saldo;
	private double limite;

	private static int totalContas;

	Data dataDeAbertura = new Data();

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	public Conta() {

		System.out.println("Construindo uma conta:");
		Conta.totalContas = Conta.totalContas + 1;

	}

	Conta(Cliente titular) {

		this.titular = titular;
	}

	Conta(Cliente titular, int numero) {
		this(titular);
		this.titular = titular;
	}

	public void sacar(double quantidade) {

		if (quantidade < 0) {
			
			JOptionPane.showMessageDialog(null,"Valor nao pode ser negativo!!",
			          "alerta", JOptionPane.ERROR_MESSAGE);
			
			//System.out.println("Valor nao pode ser negativo");

		} else if (saldo < quantidade) {
			
			 JOptionPane.showMessageDialog(null,"Saldo insuficiente!!",
			          "alerta", JOptionPane.ERROR_MESSAGE);
		
			 //System.out.println("Saldo insuficiente!!");

		} else {

			double nvSaldo = this.saldo - quantidade;
			this.saldo = nvSaldo;

		}

	}

	public void depositar(double quantidade) {
		if(quantidade < 0 ) {
			
			JOptionPane.showMessageDialog(null,"Valor nao pode ser negativo!!",
			          "alerta", JOptionPane.ERROR_MESSAGE);
			
		}
		else {
			
			this.saldo = saldo + quantidade;
			
		}
		

	}

	public void transferir(Conta destino, double quantidade) {
		if (quantidade > this.saldo) {
			 JOptionPane.showMessageDialog(null,"Saldo insuficiente!!",
			          "alerta", JOptionPane.ERROR_MESSAGE);
			
			 //System.out.println("Saldo insuficiente!!");

		} else {

			this.saldo = this.saldo - quantidade;
			destino.saldo = destino.saldo + quantidade;
		}
	}

	public double getSaldo() {

		return this.saldo + this.limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContas() {

		return Conta.totalContas;

	}

	/*
	 * public String impressaoDados() { String dados = "\n Titular: " +
	 * this.titular; dados += "\n Nome: " + this.titular.nome; dados +=
	 * "\n Sobrenome: " + this.titular.Sobrenome; dados += "\n CPF: " +
	 * this.titular.cpf;
	 * 
	 * dados += "\n Dia= " + this.dataDeAbertura.dia; dados += "\n Mes= " +
	 * this.dataDeAbertura.mes; dados += "\n Ano= " + this.dataDeAbertura.ano;
	 * 
	 * return dados; }
	 */

}
