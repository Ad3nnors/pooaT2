package br.ufscar.dc.pooa;

public class Site { //aqui colocamos tudo relacionado ao site, permitindo que o programa seja mais aberto a mudanças 
	private String link;
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public Site(String link) {
		setLink(link);
	}
}
