package Hemanchal;

public class FactorialClass {
	 
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			 fact *= i;
		}
		return fact;
	}
	public static void main(String[] arg) {
		
		FactorialClass obj=new FactorialClass();
		
	int res=obj.findFactorial(5);
	System.err.println("Factorial= "+res);
	
	int res1=obj.findFactorial(4);
	System.err.println("Factorial of 4 = "+res1);
		
	}

}
