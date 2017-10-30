package tipos;

class Teste3 {
	static int v = 10;
	final int xx = 10;
	static {
		System.out.println("Static!!!");
	}
    public static void main(String[] args) {
    	Teste3 t3 = new Teste3();
      	char c = 0;
      	final char c1 = 10;

      	switch(c) {
      		case '0': System.out.println(c + "primeiro 0");
      		case c1: System.out.println(c + "segundo 1");
      		case 2: System.out.println(c + "terceiro 2");
      		default: System.out.println(c == 1);
      	}
    }

    {System.out.println("Bloco!!!");}
}