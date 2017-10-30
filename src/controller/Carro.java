package controller;

import model.Veiculo;

public class Carro extends Veiculo {
	private static void m2(Integer i) {
		System.out.println(i);
		++i;
	}

	public static void main(String args[]) {

		Integer i1 = new Integer(10);
		m2(i1++);

		String s = String.join("de", "Antonio", "Lime");
		System.out.println(s);

		StringBuilder sb = new StringBuilder("ASD");
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}
}