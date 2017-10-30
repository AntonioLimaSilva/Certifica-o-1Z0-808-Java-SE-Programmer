package tipos;

class Person {
	String nome;
	Person cliente;
}

class Teste7 {
	static String a1 = m1("A");
	{String a2 = m1("C");}
	static {
		String a3 = m1("B");
	}

	Teste7() {
		String a4 = m1("D");
	}

	public static void main(String ... args) throws Exception {
		Teste7 t7 = new Teste7();
	}

	static String m1(String s) {
		System.out.println(s);
		return s;
	}
}