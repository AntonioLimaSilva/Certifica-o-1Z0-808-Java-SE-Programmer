package datas;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.*;
import java.time.*;
import java.util.*;

class Teste5 {
	public static void main(String args[]) throws Exception {

		LocalDateTime dataHora = LocalDateTime.now();

		Instant instante1 = dataHora.toInstant(ZoneOffset.UTC);

		Date data = Date.from(instante1);

		Date data1 = new Date();
		Instant instante2 = data1.toInstant();

		LocalDateTime dataHora1 = LocalDateTime.ofInstant(instante2, ZoneId.of("America/Sao_Paulo"));

		System.out.println(data);
		System.out.println(dataHora1);

	}
}