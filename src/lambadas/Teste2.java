package lambadas;

import java.util.*;
import java.util.function.*;

class Teste2 {
	public static void main(String args[ ]) {

		List<String> palavras = Arrays.asList("Antonio", "Gilson", "Francisca");
		List<String> palavras1 = new ArrayList<>();
		palavras1.addAll(palavras);
		
		Predicate<String> predicate = (s) -> { return s.startsWith("G"); };

		Comparator<String> comparador = (s1, s2) -> Integer.compare(s1.length(), s2.length());

		palavras1.removeIf(predicate);
		palavras.sort(comparador);

		new Thread(() -> System.out.println("Iniciando...")).start();
		
		System.out.println(palavras1);
	}
}
