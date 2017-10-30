package datas;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

class Teste2 {
	public static void main(String args[]) {

		//Convenção da API antiga para a nova
		Date dt1 = new Date();
		Instant it1 = dt1.toInstant();

		LocalDateTime ldt1 = LocalDateTime.ofInstant(it1, ZoneId.systemDefault());


		//Convenção da API nova para a antiga
		Instant it2 = ldt1.toInstant(ZoneOffset.UTC);
		Date dt2 = Date.from(it2);

		System.out.println(ldt1);
		System.out.println(dt2);

	}
}