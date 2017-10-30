package metodos;

public class Veiculo {

	public final static int VALUE = 10;

	//Todo metodo por padrão lança RuntimeException
	public void liga() {
		System.out.println("Ligando o veiculo!!!!");
	}

	public static void main(String args[]) {
		//Veiculo c1 = new Carro();
		//c1.liga();
		m1(new Veiculo());
		m1(new Carro());
		m1(new Onibus());
	}

	static void m1(Veiculo veiculo) {
		veiculo.liga();
	}
}

class Carro extends Veiculo {
	public void liga() {
		System.out.println("Ligando o carro!!!!");
	}
}

class Onibus extends Veiculo {
	public void liga() {
		System.out.println("Ligando o onibus!!!!");
	}
}