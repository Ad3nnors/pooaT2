package br.ufscar.dc.pooa;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TargetNoticia { //aqui tem tudo relacionado às notícias que se deseja extrair 
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
	
	public static Elements pegaTitulos(Site site, TargetNoticia target) throws IOException {
		Document doc = Jsoup.connect(site.getLink()).get();
        Elements titles = doc.select(target.getClasse());
		return titles;
	}
}
