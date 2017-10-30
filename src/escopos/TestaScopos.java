package escopos;

class A {
	static int id = 10;
	String nome;

	public void m1() {
		System.out.println(id);
		{
			int i = 10;
		}
		if(1 < 2) {
			int i = 0;
			System.out.println(i);
		}
	}

	public static void m2() {
		System.out.println(id);
	}

	public void m3(String nome) {
		System.out.println(nome);
	}
}

final class TestaScopos {
	public final static void main(String args[ ]) {
		A a1 = new A();
		a1.m1();
	}
}