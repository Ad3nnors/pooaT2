package br.ufscar.dc.pooa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class Csv {
	
	public static PrintWriter criaArquivo(String nome, String hora) throws IOException {
		return new PrintWriter(new FileWriter(new File(String.format(nome, hora))));
	}
	
	public static void criaCsv(TargetNoticia target, String hora, Elements titles) throws IOException {
		
		try (PrintWriter pw = criaArquivo("dump-%s.csv", hora)) {
            pw.println("Tipo;Notícia;Link"); 
            
            for (Element t : titles) {
            	pw.print(String.format(target.getTipo()+";\"%s\";", t.text())); 
            	Element parent = t; // como utilizamos a para selecionar o título, para encontrar o a, começamos pelo próprio t (que é o a) 
                
            	while (parent != null && !parent.tagName().equals("a")) parent = parent.parent();
                if (parent != null && parent.tagName().equals("a")) pw.print(String.format("\"%s\"", parent.attr("href")));
                pw.print("\n");
            }
        }
	}
}
