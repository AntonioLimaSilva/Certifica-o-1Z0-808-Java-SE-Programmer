package lambadas;

import java.util.*;
import java.util.function.*;

class Teste1 {
	public static void main(String args[ ]) {

		List<String> palavras = Arrays.asList("Antonio", "Gilson", "Francisca");

		Comparator<String> comparador = (s1, s2) -> {
			if(s1.length() < s2.length())
				return -1;
			else if(s1.length() > s2.length())
				return 1;
			return 0;
		};

		Consumer<String> consumidor = s -> System.out.println(s);

		palavras.sort(comparador);
		palavras.forEach(consumidor);
		
		System.out.println(palavras);
	}
}

