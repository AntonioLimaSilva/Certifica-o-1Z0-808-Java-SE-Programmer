package exception;

class MinhaException extends Exception {

}

class Teste1 {
	public static void main(String args[]) {
		try {
			m1();
		} catch(Exception e) {

		}
		int arrayNull[] = null;
		m1(arrayNull);

	}

	static void m1() throws MinhaException {
		throw new MinhaException();		
	}

	static void m1(int []array) {
		try{
			System.out.println(array.length);
		} catch(Exception e) {
			System.out.println("Peguei NullPointerException....");
		}
	}
}