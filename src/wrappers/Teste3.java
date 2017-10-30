package wrappers;

public final class Teste3 {
	public final static void main(String args[]) {
	
		m1();		
		System.out.println("Fim do programa");
	}

	private static void m1() {
		try {
			throw new java.io.FileNotFoundException();
		} catch(java.io.IOException e) {
			System.out.println("Peguei");
		}
	}
}