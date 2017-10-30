package referencia;

class Person {
	private String nomeCompleto;

	Person(String firstName, String lastName) {
		this.nomeCompleto = firstName + " " + lastName;
	}

	public String nomeCompleto() {
		return nomeCompleto;
	}
}

public class Teste4 {
	public static void main(String args[]) {

		Person p = new Person("Antonio", "Lima");
		System.out.println(p.nomeCompleto());
	}
}