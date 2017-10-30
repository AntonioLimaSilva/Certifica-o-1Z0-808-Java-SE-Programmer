package referencia;

abstract class A {
	abstract void m1();
}

class B extends A {
	void m1() {
		System.out.println("B");
	}
}

public class Teste6 {
	public static void main(String args[]) {

		//A a = new B();
		//System.out.println(a.valor + " " + a.m1());
		//B b = (B) a;
		//System.out.println(b.valor + " " + b.m1());

		try {
			A a = new B();
			a.m1();
		} catch(NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}


	}
}