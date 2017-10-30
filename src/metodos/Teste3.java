package metodos;

class A {

	A() {
		System.out.println("sem argumentos");
	}

	A(String ... str) {
		this(m1());
		System.out.println("com varargis");
	}

	A(int i) {
		this();
		System.out.println("com int");
	}

	static int m1() {return 1;}
}

class B extends A {
	B(String str) {
		super(s());
		System.out.println("Fim do construtor");
	}

	static String s() {return "xpto";}
}

public class Teste3 {
	public final static void main(String args[]) {
		A a = new B("A");
	}
}