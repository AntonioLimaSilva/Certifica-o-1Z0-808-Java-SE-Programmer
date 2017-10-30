package metodos;

interface A {
	//Metodo abstract pode sobrescrito como abstrato ou como default
	void m1();

	//Metodo default pode ser sobreescrito com default ou como abstrato
	default void m2() {
		System.out.println("Default");
	}

	//Metodos estaticos pode ser sobreescrito como static, como default ou com abstrato
	static void m3() {
		System.out.println("Static");
	}
}

interface D extends A {
	void m1();
	void m2();
	void m3();
}

abstract class B implements A {
	public abstract void m1();
}

class C extends B {
	public void m1() {
		System.out.println("C");
	}
}

class Teste7 {
	public static void main(String args[]) {

		A a = new C();
		a.m1();
		a.m2();
		A.m3();

	}
}