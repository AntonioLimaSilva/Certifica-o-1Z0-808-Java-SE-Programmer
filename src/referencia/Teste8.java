package referencia;

public class Teste8 {

	public static void main(String args[]) {
		String s = "javaee";
		char array[] = {'1', 'Z','-', '8', '1'};
		//Lembrar que o segundo parametro independente do número, vai começar a contar dali,
		//e ai o terceiro parametro terá ter a quantidade exata de caracter caso contrario dará erro
		StringBuilder sb = new StringBuilder();
		sb.append(array, 0, 1);
		sb.append(0x1F);
		
		System.out.println(s.subSequence(s.length()-6, s.length()-3));
		System.out.println(sb);
	}
}