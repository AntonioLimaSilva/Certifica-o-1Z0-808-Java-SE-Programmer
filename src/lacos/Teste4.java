package lacos;

class Teste4 {
	void probe(double x) { System.out.println("In double"); }

	void probe(Object x) { System.out.println("In Object"); }
	void probe(Double x) { System.out.println("In Double"); }

    //void probe(Number x) { System.out.println("In Number"); }

    void probe(Integer x) { System.out.println("In Integer"); }
    
    void probe(Long x) { System.out.println("In Long"); }

	public static void main(String args[]) {
		Long l = new Long(10);
		Double d = 10.0;
		Integer i = 10;
		Short s = 10;
		Character c = 10;
		Teste4 t4 = new Teste4();
		t4.probe(d);

	}
}