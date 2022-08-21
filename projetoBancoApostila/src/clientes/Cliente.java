package clientes;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String endereco;
	private int idade;
	private String cpf;
	
	/* valida cpf */
	
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf= cpf;
		
	}
	
	public void validaCPF(String cpf) {
		
		if(this.idade <= 60) {
			validaCPF(cpf);
			
		}
		this.cpf= cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
