package lacos;

class Teste2 {

	public final static void main(String args[ ]) {

		B.main(new String[0]);

	}

	interface B {
		public static void main(String args[]) {
			if(args.length > 0 && args != null)
				System.out.println(args[0]);
		}

		public static void print() {}

		void m1();
	}
}