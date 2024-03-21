package br.com.teste.tgid;

public class Empresa extends Usuario {
	
	private String cnpj;
	
	public Empresa(String nome, String email, String cnpj) {
		super(nome, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public boolean isValid() {
		return Validador.isCnpjValido(cnpj);
	}

}
