package exception;

class Teste2 {
	public static void main(String args[]) {		
		System.out.println(m1((byte)2));
	}

	static float m1(byte b) {
		float f = 10.0f;
		return (int) b * f;
	}

	static float m1() {
		return (1 + 2 * 4);
	}

	static int m1(int i) {
		try{
			System.out.println(i);
			return i;
		} catch(Exception e) {
			System.out.println("Peguei NullPointerException....");
			return 2;
		} finally {
			return 3;
		}
	}
}