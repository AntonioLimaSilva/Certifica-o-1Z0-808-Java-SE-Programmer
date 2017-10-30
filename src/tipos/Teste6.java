package tipos;

class A {
    static int a = 20;
    static void m1() {
         System.out.println("M1");
    }
}

class Teste6  extends A {
    public static void main(String[] args) {
         System.out.println("Fim!!!");
         new Teste6().m2();
    }

     static void m1() {
        
    }

    void m2() {
        System.out.println();
        this.m1();
    }

    static float m1(float i) {
        try {
             System.out.println("Try!!!");
             return i;
        } catch(Exception e) {
             System.out.println("Catch!!!");
           // return 1; 
        } finally {
            //return 1;  
        }  

       return 1; 
        
    }

}