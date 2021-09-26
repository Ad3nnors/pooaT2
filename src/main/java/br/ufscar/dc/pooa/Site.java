package br.ufscar.dc.pooa;

public class Site {
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
