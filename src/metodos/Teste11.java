package metodos;

import java.time.LocalDate;
import java.lang.Math.*;

abstract interface A {
	default void m1() {System.out.println("A");}
}

interface B extends A {
	default void m1() {System.out.println("B");}
}

class Teste11 implements A, B {

	public static void main(String args[ ]) throws java.io.IOException {
	
		Object o = new int[10];
		int[] i1 = (int[])o;
		int i = (int)(Math.random() * 6) + 1;
		StringBuilder sb = new StringBuilder("whiz");
		LocalDate lt = LocalDate.ofYearDay(2017, 20);

		B b1 = new Teste11(); // <= b1 and a1
		A a1 = new Teste11();
		b1.m1();
		a1 = (A)b1;
		a1.m1();


		System.out.println((int)Math.random());
		System.out.println(i);
		System.out.println(lt.getMonthValue());
		System.out.println(sb.delete(1, 170));

	}
}