package metodos;

interface Veiculo {
	int ID = 1;
	void m1();
	default int m2() {
		return 1;
	}
	static String m3() {
		return "xpto";
	}
}

interface Carro extends Veiculo, Runnable {
	void m1();
	default int m2() {return 2;}
	default String m3(){return "word";}
}

class Ferrari implements Carro {
	public void m1() {
	
	}

	//public int m2() {
	//	return 2;
	//}

	public String m3() {return "hello";}

	public void run() {

	}
}

class Teste9 {
	public static void main(String args[]) {

		System.out.println(Veiculo.ID);

	}
}