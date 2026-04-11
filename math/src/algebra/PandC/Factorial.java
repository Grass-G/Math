package algebra.PandC;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial ....");
		
		Factorial factr = new Factorial();
		
		int result =  factr.fact(6);
		System.out.println("result = " +result);
	}
	
	public int fact(int number) {

		

		    if(number<0){
		        System.out.print("negatives not allowed");
		        return 0;
		       }

		       if(number==0){
		      
		        return 1;
		       }

		     int n = number;
		       for(int i = n; i > 0; i--){
		        if(i-1 >= 1){
		            n = n * (i-1);
		        }
		       }
		       
		       return n;
		      
		   

	}
	
	public int recurFact(int num) {

		if (num  < 0) {
			
			System.out.println("Invalid input"); 

			return -1;

		}

		if (num  == 0) {

			return 1;

		} else {
			return num * recurFact (num-1);
		}		

	}
	

}
