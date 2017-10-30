package datas;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.*;
import java.time.*;
import java.util.*;

class Teste6 {
	public static void main(String args[]) throws Exception {

		LocalDateTime dataHora = LocalDateTime.now();
		LocalDate dataAniversario = LocalDate.of(1989, 11, 23);
		LocalDate dataHoje1 = LocalDate.now();

		Duration duracao1 = Duration.ofDays(1);

		LocalDateTime dataAdiantada = dataHora.plus(duracao1);

		//Diferença de tempo usa-se period ou chroneUnit
		System.out.println(ChronoUnit.DAYS.between(dataHora, dataAdiantada));

		Period periodo = Period.between(dataAniversario, dataHoje1);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());

		System.out.println(dataHora);
		System.out.println(dataAdiantada);

	}
}