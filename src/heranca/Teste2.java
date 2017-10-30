package heranca;

class Teste2 {
	public static void main(String args[]) {
		char array[] = new char[]{'A','B','C','D', 3};
		StringBuilder sb1 = new StringBuilder("A");
		sb1.append(array, 2, 3).insert(2, 'X');
		

		System.out.println(sb1.toString());
		System.out.println(sb1.capacity());

		byte b = -128;
		int d = b;
		b = (byte) d;

		System.out.println(b);
		System.out.println(d);

	}
}