package estaticos;

class A {

	static void m1() {
		System.out.println("M1 -> A");
	}

	static {
		int i[] = new int[11];
		System.out.println(i[0]);
		m1();
	}

	{System.out.println("Bloco");}
}

class B extends A {
	static void m1() {
		System.out.println("M1 -> B");
	}
}

class Teste1 {
	public final static void main(String args[ ]) {

		B a1 = new B();
		B.m1();
	}
}