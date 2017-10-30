package referencia;

class A {
	void m1() {
		System.out.println("A");
	}
}

class B extends A {
	void m1() {
		System.out.println("A");
	}
}

public class Teste5 extends B {
	int i1 = 10;
	void m1() {
		int i = 2;
		i = this.i1;
		System.out.println(i);
	}

	public static void main(String args[]) {

		Teste5 t5 = new Teste5();

		t5.m1();

		int a = 1;
		int b = -5;

		if(a < b)
			System.out.println("Sim");

	}
}