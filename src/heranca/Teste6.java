package heranca;

class Pessoa {
	String nome;
}

class Teste6 {

	String nome = s;
	static String s = "";


	public static void main(String args[]) {

		args = new String[10];
		args[0] = "A";

		System.out.println(args[0]);

		StringBuilder sb = new StringBuilder("ABC");
		sb.append("FV");
		//sb.setLength(3);

		Pessoa pessoa = new Pessoa();

		System.out.println(Teste6.pessoa);

		Teste6.pessoa = pessoa;
		Teste6.pessoa.nome = "Joao";
		pessoa.nome = "Maria";

		System.out.println(Teste6.pessoa.nome);
		System.out.println(sb);

		int y = 10;
                   
        if(y++ == 10) 
            if(y-- == 10)
                if(y == 10);
                else
                	y *=3;
        	else 
        		y *=2;
                                 
        System.out.println(y);

	}

	static Pessoa pessoa;
}