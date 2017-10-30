package datas;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

class Teste3 {
	public static void main(String args[]) {

		Instant it1 = Instant.now();
		Duration d1 = Duration.ofSeconds(10);
		Instant it2 = it1.plus(d1);
		Instant it3 = Instant.EPOCH;

		long segundos = Duration.between(it1, it3).getSeconds();

		System.out.println(it1);
		System.out.println(it2);
		System.out.println(segundos);

	}
}