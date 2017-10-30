package metodos;

import java.util.*;

enum Atividade {
	A("Faxineiro"),
	B("Zelador"),
	C("Gerente");

	private final String descricao;

	private Atividade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}

abstract class A {
	A(String s) {
		System.out.println(s);
	}

	public abstract void m1();

	public void m2() {}
}

class B extends A {
	B() {
		super(VALUE);
	}

	private final static String VALUE = "A";

	@Override
	public void m1() {
		System.out.println("B");
	}
}

class Teste12 {

	public static void main(String args[ ]) throws java.io.IOException {

		A a1 = new B();
		a1.m1();
		System.out.println(Arrays.asList(Atividade.A.getDescricao()));
		Atividade[] array = Atividade.values();
		for(Atividade a : array)
			System.out.printf("Nomes: %s\n ", a.getDescricao());

	}
}