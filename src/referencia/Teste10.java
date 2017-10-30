package referencia;

class A {
	A(){System.out.println("A");}
	A(String s){
		this();
	}
}

abstract class B extends A {
	B(){System.out.println("B");}
}

class C extends B {
	C(){
		this("CCC");
		System.out.println("C");
		System.out.println(super.toString());
		
	}

	C(String s) {
		System.out.println(s);
	}
}

class Teste10 {
	//static C a = new C();
	public static void main(String args[ ]) {

		//C c1 = new C();
		//A b1 = new C();
		//Teste10 t10 = new Teste10();
		//t10.m1();
		
		//System.out.println(c1 instanceof Object);
		//System.out.println(b1 instanceof B);
		//System.out.println(b1 instanceof B);
		//I.getId();
	}

	void m1() {
		I i1 = new I();
		System.out.println(i1.getId());
	}

	class I {
		int id = 10;
		int getId(){
			return id;
		}
	}
}