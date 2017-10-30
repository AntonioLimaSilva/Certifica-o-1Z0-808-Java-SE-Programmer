package heranca;

class Teste7 {

	static {
		System.out.println("Executando....");
		//System.exit(0);
		System.out.println("Finalizando....");
	}

	public void m1(Teste6 teste6) {}

	public static void main(String args[]) {
		int x = 4;
		long y = x * 4 - x++;

		System.out.println(y);
		System.out.println(x);
	}
}