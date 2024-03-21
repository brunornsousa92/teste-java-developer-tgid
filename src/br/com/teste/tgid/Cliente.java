package br.com.teste.tgid;

public class Cliente extends Usuario {
	
	private String cpf;
	
	public Cliente(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean isValid() {
		return Validador.isCpfValido(cpf);
	}
}
