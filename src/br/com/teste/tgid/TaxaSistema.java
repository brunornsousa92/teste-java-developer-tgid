package br.com.teste.tgid;

public class TaxaSistema {
	
	private int id;
    private String nome;
    private TipoTaxa tipoTaxa;
    private double valor;
    private Empresa empresa;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoTaxa getTipoTaxa() {
		return tipoTaxa;
	}
	public void setTipoTaxa(TipoTaxa tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
    
    public enum TipoTaxa {
    	FIXA,
    	PERCENTUAL
    }
	

}
