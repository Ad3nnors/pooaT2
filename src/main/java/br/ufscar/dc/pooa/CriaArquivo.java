package br.ufscar.dc.pooa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class CriaArquivo {  //a classe cria arquivo possui apenas a responsabilidade de criar um arquivo
	public static PrintWriter criaArquivo(String nome) throws IOException {
		return new PrintWriter(new FileWriter(new File(String.format(nome))));
	}
}
