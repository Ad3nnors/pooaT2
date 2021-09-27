package br.ufscar.dc.pooa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Hora {
	public static String getHoras(String formato) {
		return DateTimeFormatter.ofPattern(formato).format(LocalDateTime.now());
	}
}
