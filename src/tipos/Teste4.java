package tipos;

class A {}

class Teste4 {
    static void m1(StringBuffer bf, char []c) {
        bf.append(c, 2, 4);
    }

    public static void main(String[] args) {
    	  StringBuffer sb = new StringBuffer("ABC");
        m1(sb, new char[]{'D', 'E','F','G','H','I'});
        System.out.println(sb.toString()); //ABCFGHI
    }
}