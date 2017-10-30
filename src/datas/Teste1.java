package datas;

import java.time.*;

class Teste1 {
	public static void main(String args[]) {

		LocalDateTime ldt1 = LocalDateTime.now();

		LocalDate ld1 = ldt1.toLocalDate();
		LocalTime lt1 = ldt1.toLocalTime();

		LocalDateTime ldt2 = ld1.atTime(lt1);
		LocalDateTime ldt3 = lt1.atDate(ld1);

		System.out.println(ldt1);
		System.out.println(ld1);
		System.out.println(lt1);
		System.out.println(ldt2);
		System.out.println(ldt3);

	}
}