package lacos;

class Teste1 {
	public final static void main(String args[ ]) {

		lacofor: for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		int i = 0;
		lacowhile: while(i++< 10) {
			if(i == 2) break lacowhile;
			System.out.println(i);
		}

	}
}