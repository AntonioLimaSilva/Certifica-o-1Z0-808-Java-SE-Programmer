package metodos;

class Veiculo {}
class Moto extends Veiculo {}
class Carro extends Veiculo {}
class CarroRodavel extends Carro implements Runnable {
	public void run() {

	}
}

class Teste10 {
	public static void main(String args[]) {

		Object obj = new Object();
		obj = "hello";

		String str = (String) obj;

		Veiculo v1 = new Carro();
		Carro c1 = (Carro) v1;
		Moto m1 = (Moto)v1;

		Carro c2 = new CarroRodavel();
		//Moto m2 = (Moto)c2; // Não compila, brends diferentes
		CarroRodavel r = (CarroRodavel) c2;

	}
}