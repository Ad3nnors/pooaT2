package br.ufscar.dc.pooa;

public class TargetNoticia {
	private String classe;
	private String tipo;
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public TargetNoticia(String classe, String tipo) {
		setClasse(classe);
		setTipo(tipo);
	}
	
}
