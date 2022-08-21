package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import contas.Conta;


import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DadosConta extends JFrame {

	private JPanel contentPane;
	private JTextField tfAgencia;
	private JTextField tfNumero;
	private JTextField tfTitular;
	private JTextField tfSaldo;
	private JTextField tfValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosConta frame = new DadosConta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Conta conta1= new Conta();

	/**
	 * Create the frame.
	 */
	public DadosConta() {
		setTitle("TRANSA\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DADOS DA CONTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(167, 11, 148, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblAgencia = new JLabel("Agência:");
		lblAgencia.setBounds(22, 48, 57, 14);
		contentPane.add(lblAgencia);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(22, 73, 57, 14);
		contentPane.add(lblNumero);
		
		JLabel lblTitular = new JLabel("Titular:");
		lblTitular.setBounds(22, 98, 57, 14);
		contentPane.add(lblTitular);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(22, 123, 46, 14);
		contentPane.add(lblSaldo);
		
		tfAgencia = new JTextField();
		tfAgencia.setBounds(100, 45, 127, 20);
		contentPane.add(tfAgencia);
		tfAgencia.setColumns(10);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(101, 70, 126, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		tfTitular = new JTextField();
		tfTitular.setBounds(100, 95, 127, 20);
		contentPane.add(tfTitular);
		tfTitular.setColumns(10);
		
		tfSaldo = new JTextField();
		tfSaldo.setBounds(100, 120, 127, 20);
		contentPane.add(tfSaldo);
		tfSaldo.setColumns(10);
		
		JButton btnCriarConta = new JButton("Criar conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//conta1.criarConta();
				
				}
		});
		btnCriarConta.setBounds(77, 173, 103, 23);
		contentPane.add(btnCriarConta);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				conta1.sacar(Double.parseDouble(tfValor.getText()));
				double limite = conta1.getSaldo();
				
				tfSaldo.setText(""+limite);
				//System.out.println(limite);
			}
		});
		btnSacar.setBounds(222, 173, 89, 23);
		contentPane.add(btnSacar);
		
		JButton btnDeposito = new JButton("Depositar");
		btnDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				conta1.depositar(Double.parseDouble(tfValor.getText()));
				double limite= conta1.getSaldo();
				
				tfSaldo.setText(""+limite);
		    	//System.out.println(limite);
		    	
		    	
			}
		});
		btnDeposito.setBounds(335, 173, 89, 23);
		contentPane.add(btnDeposito);
		
		JLabel lblValor = new JLabel("Valor a ser movimentado");
		lblValor.setBounds(265, 49, 169, 14);
		contentPane.add(lblValor);
		
		tfValor = new JTextField();
		tfValor.setBounds(255, 73, 169, 27);
		contentPane.add(tfValor);
		tfValor.setColumns(10);
	}
}
