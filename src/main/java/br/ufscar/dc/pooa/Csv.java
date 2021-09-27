package br.ufscar.dc.pooa;

import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class Csv {
	
	public static void criaCsv(TargetNoticia target, String hora, Elements titles) throws IOException {
		String nome = "dump-" + hora + ".csv";
		try (PrintWriter pw = CriaArquivo.criaArquivo(nome)) { //essa classe possui apenas a responsabilidade de gerar o csv
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
