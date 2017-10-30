package metodos;

import referencia.*;

public class Funcionario extends Pessoa {

	protected String nome = "Funcionario";

	public String m1() throws NullPointerException, ArrayIndexOutOfBoundsException {
		System.out.println(nome);
		return new Object().toString();
	}

	public static final void main(String args[]) {
		Pessoa p = new Funcionario();
		p.m1();
	}
}