package formatacao;

public final class Teste1 {
	public final static void main(String args[]) throws Exception {

		//%[index$][flags][width][.precision]type

		System.out.format("{Hi %2$10s, heve a nice day!!}\n", "Antonio", "Luciano");
		System.out.printf("[%05d]", 10);
		System.out.printf("ola");
		System.out.printf("%d", 10);

		byte[] b = new byte[]{'c'};
		byte b1 = 'c' + 1;

	}
}