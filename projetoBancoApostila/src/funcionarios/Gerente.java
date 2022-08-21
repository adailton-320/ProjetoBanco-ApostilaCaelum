package funcionarios;

public class Gerente extends Funcionarios {
	
	private String senha;
	private int numFuncionarios;
	
	@override
	public double getBonificacaoSalario() {
		return super.getBonificacaoSalario() + 1000;
	}
	
	
	public boolean validaSenha(String senha) {
		
		if(this.senha.equals(senha)) {
			System.out.println("Acesso Permitido");
			return true;	
		}else {
			System.out.println("Acesso Negado!");
			return false;
		}
		
		
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getNumFuncionarios() {
		return numFuncionarios;
	}


	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	
	

}
