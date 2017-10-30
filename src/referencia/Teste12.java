package referencia;

class Veiculo {

	String nome = "Ferrari";
	Veiculo v1;

	public String toString() {
		return "{ Veiculo...}";
	}

}

class Teste12 {
	public static void main(String args[ ]) throws Exception {

		Veiculo veiculo1 = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		veiculo1.v1 = veiculo1;
		veiculo2.v1 = veiculo2;

		m1(veiculo1, veiculo2);

		System.out.println(veiculo1.nome);
		System.out.println(veiculo2.v1.nome);
	}

	private static void m1(Veiculo x1, Veiculo x2) {
		x1 = new Veiculo( );
		x2 = x1;
	}
}