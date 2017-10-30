package heranca;

class A {
	static int valor = 10;

	void m1() {

	}
}

class B extends A {
	int valor = 20;
	protected void m1() {
		
	}
}

class Teste1 {
	public static void main(String args[]) {

		A a = new B();
		System.out.println(((B)a).valor);

	}
}