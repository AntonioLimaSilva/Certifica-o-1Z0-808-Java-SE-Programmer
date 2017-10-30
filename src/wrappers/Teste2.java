package wrappers;

public final class Teste2 {
	public final static void main(String args[]) {

		try {
			m1();
		} catch(java.io.FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch(java.io.IOException e) {
			System.out.println("IOException");
		}

	}

	private static void m1() throws java.io.IOException {
		throw new java.io.FileNotFoundException();
	}
}