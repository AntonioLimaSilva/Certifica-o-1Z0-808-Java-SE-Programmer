package referencia;

import java.util.*;
import java.sql.Date.*;
import metodos.a.*;

class MinhaException extends Exception {
	public MinhaException(String msg) {
		super(msg);
	}
}

class Teste11 {
	Date d1;
	public static void main(String args[ ]) throws Exception {
		int y = 10,  x;
		String s;
		if(4 > 5) {
			s = "12";
		} else {
			s = "A";
			System.out.println(s);
			throw new MinhaException("Checked");
		}
	}
}