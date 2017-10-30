package referencia;

class Vehicle {
	// 2º
	{ System.out.println("Vehicle"); }
}

class Car extends Vehicle {
	Car(String nome) {
		super();
		// 3º
		System.out.println("Constructor");
	}

	// 1º
	//Basta carregar a classe e esse bloco será executado
	static {
		System.out.println("Static");
	}
}

public class Teste1 {
	final public static void main(String args[]) {
	
		Car v1 = new Car("Palio");

	}

	// Só vai ser samado si tiver uma instancia da classe onde bloco esta inserido
	{ System.out.println("Dentro da classe Teste"); };;;;

}