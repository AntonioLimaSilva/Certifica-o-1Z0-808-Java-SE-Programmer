package tipos;

class Teste8 {
	public static void main(String ... args) throws Exception {
		
		int i = 0;
		long l = 0;
		char c = 'A';
		byte b1 = 0;
		b1 += c;

		c += 10;
		b1 += 1010;
		//b1 = b1 + 100;

		System.out.println(b1);
		System.out.println(c);
		System.out.println(!(true != 2 - 1 > 5));
	}
}