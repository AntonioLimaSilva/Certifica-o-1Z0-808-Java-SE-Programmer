package referencia;

class Teste2 {

	static int b = 10;

	static {
		int c = 10;
		b = 20;
	}

	public final static void main(String args[ ]) {

		StringBuilder sb = new StringBuilder("ABC");
		sb.append("DEF");

		System.out.println(sb.length());

		//Valor default do método capacity é 16, caso seja passado alguma string no construtor
		//é somando esses caracteres, resultando em um novo valor no método capacity
		System.out.println(sb.capacity());

	}
}