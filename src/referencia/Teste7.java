package referencia;

public class Teste7 {


	final String s2;

	//Compila e roda
	{s2 = "D";}

	public static void main(String args[]) {
		String s1 = "hello";
		String s2 = "HELLO";
		String s3 = "he";

		System.out.println(s1 == s2);
		System.out.println("hello" == s1.toLowerCase());
		System.out.println("hello" == s1.toString());
		System.out.println("hello" == (s3 + "llo").intern());
		System.out.println("hello" == "he" + "llo");
		System.out.println(true ^ !(false | true));
		System.out.println(false && true);
	}
}