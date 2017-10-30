package datas;

import java.time.LocalDateTime;
import java.time.LocalDate;

class Teste4 {
	public static void main(String args[]) throws Exception {

		LocalDateTime dataHora = LocalDateTime.now();

		java.time.LocalTime time = dataHora.toLocalTime();
		java.time.LocalDate data = dataHora.toLocalDate();

		LocalDateTime dataHora1 = time.atDate(data);
		LocalDateTime dataHora2 = data.atTime(time);

		System.out.println(time);
		System.out.println(data);
		System.out.println(dataHora1);
		System.out.println(dataHora2);

	}
}