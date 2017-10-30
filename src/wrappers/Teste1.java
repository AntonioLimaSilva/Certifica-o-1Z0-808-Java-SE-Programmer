package wrappers;

public final class Teste1 {
	public final static void main(String args[]) throws Exception {

		Double d1 = new Double("10D");
		Integer i1 = new Integer(10);

		//wrapper => primitivo
		int i2 = i1.intValue();

		//String => primitivo
		int i3 = Integer.parseInt("10A", 16);
		double d2 = Double.parseDouble("15D");

		//String => Wrapper
		Boolean b1 = new Boolean("true");
		Boolean b2 = Boolean.valueOf("t");


		//primitivo => Wrapper
		Boolean b3 = Boolean.valueOf(true);

		//primitivo para string
		String str1 = Integer.toString(10);

		//wrapper => string
		Short s1 = new Short((short)10);
		String str2 = s1.toString();

		Integer i5 = 100;
		Long i6 = 100l;
		Double d5 = 100d;

		//System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));

	}
}