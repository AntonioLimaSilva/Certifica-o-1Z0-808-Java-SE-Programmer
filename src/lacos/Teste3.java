package lacos;

class Teste3 {

	public final static void main(String args[ ]) {

		String []table[] = new String[3][];
		String x[] = new String[]{"Azul", "Vermelho", "Branco"};
		String []y = new String[]{"1", "2", "3"};
		String []z = new String[]{"A", "B", "C"};

		table[0] = x;
		table[1] = z;
		table[2] = y;

		for(String[] row : table) {
			System.out.print(row[row.length - 1]);
		}

		for(int row = 0; row < table.length; row++)
			for(int col = 0; col < table[row].length; col++)
				System.out.println(table[row][col]);

		int d = 10;
		//System.out.println(d = 20 > 10);
		System.out.println(d + 20 > 40);

	}

}