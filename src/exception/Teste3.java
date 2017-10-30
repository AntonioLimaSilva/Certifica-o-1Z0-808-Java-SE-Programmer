package exception;

class Teste3 {
	
	public static void main(String args[]) {

		m1();

		for1:
		do {
			System.out.println("AAA");
			break for1;
		}
		while(true);

		System.out.println("BBB");

	}

	private static void m1() {
		System.out.println("Before M1");
		int y[] = new int[10];
		y[9] = 10;

		m2();
		System.out.println("After M1");
	}

	private static void m2() {
		System.out.println("Before M2");
		String s = null;
		try {
			s.concat("AAA");
		}catch(NullPointerException e) {
			System.out.println("Tratei...");
		}
		System.out.println("After M2");
	}

}