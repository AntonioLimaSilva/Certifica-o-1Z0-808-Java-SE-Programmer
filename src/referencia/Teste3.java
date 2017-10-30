package referencia;

interface A {
	default void m1() {
		System.out.println("A");
	}
}

interface B {
	default void m2() {
		System.out.println("B");
	}
}

public class Teste3 implements B, A {
	private int idade = 10;

	public void m1(int idade) {
		System.out.println(this.idade);
		this.idade = idade;
		System.out.println(this.idade);
	}

	final public static void main(String args[]) {
	
		Teste3 t3 = new Teste3();
		t3.m1(20);

		Runnable b = () -> System.out.println("Oi");
		b.run();

		int i = 0;
		int a = 0;

		if((i = 5) > 1) {
			System.out.println("Verdadeiro");
		}

	}

}