package heranca;

import java.util.*;

abstract interface A {
	public final static int value = 10;
	public default int m1() {
		return 100;
	}
}

interface B extends A {
	default int m1() {
		return 200;
	}
}

class C implements B, A {
	
}

class Teste3 {
	public static void main(String args[]) {

		//B a = new C();
		//System.out.println(a.m1());
		//System.out.println(a);
		//System.out.println(A.m1());

		ArrayList<String> list = new ArrayList<>();	
		int [] array = new int[10];
		Object obj = new Object();
		String s = "Antonio Lima";
		int i = 1;

		boolean resultado = 6 == 6 && 7 != 7 + 8;
		System.out.println(resultado);
		System.out.println(array.getClass().isArray());
		System.out.println(s.subSequence(5, 7));
		System.out.println(++i >= 2);

	}
}