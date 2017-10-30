package tipos;

class Teste5 {
	static int []array1, array2[];
	static int [][]array3;
	static int [] array4, array5[], array6[];

    public static void main(String[] args) {
    
    	array6 = array3;
    	array5 = array3;
    	array3 = array5;
    	array2 = array5;
    	array6 = array2;

    	//cassos que não pode!
    	//array1 = array3;
    	//array3 = array1;
    	//array3 = array4;

    	String arr1[][] = {args};

    	for(String i1[] : arr1)
    		for(String i : i1)
    			System.out.println(i);

    }
}