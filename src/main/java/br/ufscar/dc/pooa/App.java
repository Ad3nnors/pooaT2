package br.ufscar.dc.pooa;

import java.io.IOException;

import org.jsoup.select.Elements;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Site site = new Site("https://g1.globo.com/"); //aqui é seguido o segundo princípio, pois as informações ficam encapsuladas e a alteração pode ser feita sem mexer na classe
    	TargetNoticia target = new TargetNoticia("a.feed-post-link", "Principal"); //pega classe e tipo
    	String hora = Hora.getHoras("yyyy-MM-dd-HH-mm-ss"); //aqui é separado para seguir o princípio da responsabilidade única
    	Elements titles = TargetNoticia.pegaTitulos(site, target);
    	Csv.criaCsv(target, hora, titles);
    }
}
