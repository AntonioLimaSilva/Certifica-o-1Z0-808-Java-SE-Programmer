package metodos;

class A {

	//1º inicialização das variaveis, com seus valores padrão. Ex: nome = null
	String nome; 

	//2º Executar o construtor
	A(String nome) {
		tamanhoDoNome();
		this.nome = nome;
	}

	void tamanhoDoNome() throws NullPointerException {
		System.out.println(nome.length());
		return;
	}

}

class B extends A {

	B(String nome) {
		super(nome);
	}

	@Override
	void tamanhoDoNome() throws RuntimeException, IllegalArgumentException {
		System.out.println(nome);
		return;
	}

}

public class Teste2 {
	public final static void main(String args[]) {

		A a = new B("Antonio");

	}
}