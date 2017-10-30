package metodos;

class A {

	A() {
		m1();
	}

	void m1() {
		System.out.println("M1 -> A");
	}

}

class B extends A {

	B() {
		m1();
	}

	void m1() {
		System.out.println("M1 -> B");
		return;
	}
}

class Teste1 {
	public final static void main(String args[ ]) {

		B a1 = new B();

		int i[][] = {{1, 2, 3}, {4, 5}};

		// Só funciona esse i[1] para arrays bidimencional
		for(int i1 : i[1]) {
			System.out.println(i1);
		}
		
	}
}