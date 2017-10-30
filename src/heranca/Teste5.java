package heranca;

enum Nota {
	NOTA_BAIXA("6.0"),
	NOTA_MEDIA("7.5"),
	NOTA_ALTA("9.5");

	private String descricao;

	Nota(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}

class Teste5 {
	public static void main(String args[]) {

		switch(Nota.NOTA_MEDIA) {
			case NOTA_MEDIA:
				System.out.println(Nota.NOTA_MEDIA.getDescricao());				
			case NOTA_ALTA:
				System.out.println(Nota.NOTA_ALTA.getDescricao());
			default:
                throw new AssertionError("Unknown RIR ");
		}

	}
}