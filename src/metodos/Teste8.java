package metodos;

interface Forma {
	java.util.List<String> m1();
}

class Quandrado implements Forma {

	@Override
	public java.util.ArrayList<String> m1() {
		return new java.util.ArrayList<>();
	}
}

class Teste8 {
	public static void main(String params[]) {

		Forma f1 = new Quandrado();
		java.util.List<String> lista = f1.m1();
		lista.add("java");
		lista.add("C#");
		lista.add("php");
		lista.set(0, "java ee");

		System.out.println(lista.isEmpty());
		System.out.println(lista.contains("php"));
		System.out.println(lista.indexOf("php"));
		System.out.println(lista);

		System.out.println(m2(1));

	}

	static int m2(int i) {
		return 0 + (++i);
	}

	static int[] m2() {
		return new int[10];
	}
}