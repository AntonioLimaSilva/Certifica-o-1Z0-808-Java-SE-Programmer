package metodos;

import java.util.*;

class Teste13 {

	public static void main(String args[ ]) throws java.io.IOException {
	
		System.out.println(1 + 2 * m1(10));

		char c[] = {'a', 'c','f', 65};
		StringBuilder sb = new StringBuilder(10);
		//A versao sobrecarregado do append tem uma diferença sutil, recebe qualquer tipo
		//de array, o segundo argumento é o indice inicial, o terceiro leva em consideração
		//a posição inicial do segundo argumento.
		sb.append(c, 3, 1);
		System.out.println(sb.capacity());
		System.out.println(sb);
		//O primeiro argumento sempre leve em consideração a posição inicia em 0
		//O segundo argumento leve em consideração sempre o tamanho da string
		System.out.println("abcdefg".subSequence(4, 7));

		int i = 0;
		System.out.println(i = 10*10);
		Arrays.sort(c, 1, 4);
		System.out.println(c);

	}

	static int m1(int i) {
		System.out.println("M1");
		return 1;
	}
}