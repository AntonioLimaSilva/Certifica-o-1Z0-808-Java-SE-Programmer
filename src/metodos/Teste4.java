package metodos;

class A {
	final String nome;

	A(String nome) {
		method();
		this.nome = nome;		
	}

	private void method() {
		System.out.println(nome);
	}
}

class B extends A {

	B(String nome) {
		super(nome);
	}

	//@Override
	public void method() {
		System.out.println(nome.length());
	}
}

final class Teste4 {
	public static final void main(String args[]) {

		A a = new B("A");

	}
}