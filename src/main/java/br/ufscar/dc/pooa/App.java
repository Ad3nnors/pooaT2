package br.ufscar.dc.pooa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.ufscar.dc.pooa.Site;
import br.ufscar.dc.pooa.TargetNoticia;
import br.ufscar.dc.pooa.Csv;

public class App 
{
	public static String getHoras(String formato) {
		return DateTimeFormatter.ofPattern(formato).format(LocalDateTime.now());
	}
	
	public static Elements pegaTitulos(Site site, TargetNoticia target) throws IOException {
		Document doc = Jsoup.connect(site.getLink()).get();
        Elements titles = doc.select(target.getClasse());
		return titles;
	}
	
    public static void main( String[] args ) throws IOException
    {
    	Site site = new Site("https://g1.globo.com/");
    	TargetNoticia target = new TargetNoticia("a.feed-post-link", "Principal"); //pega classe e tipo
    	String hora = getHoras("yyyy-MM-dd-HH-mm-ss");
    	Elements titles = pegaTitulos(site, target);
    	Csv.criaCsv(target, hora, titles);
    }
}
