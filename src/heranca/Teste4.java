package heranca;

class A {
	int value = 10;
	public void max() {
		System.out.println("A");
	}
}

class B extends A {
	int value = 20;
	public void max() {
		System.out.println("B");
	}
}

class C extends B {
	C() {}
	int value = 30;
	public void max() {
		System.out.println("C");
	}
}

class Teste4 {
	public static void main(String args[]) {

		System.out.println((int)(Math.random() * 5)+1);;

		A a = new B();
		((A)a).max();
		System.out.println(((A)a).value);
		System.out.println(0b0101L);
		System.out.println(0xF0FDFL);
		System.out.println(0445457L);

		StringBuilder sb = new StringBuilder(10);
		sb.setLength(100);
		System.out.println(sb.capacity());

		int i = 'a' + 2;
		System.out.println(i);
;;;

	};
};