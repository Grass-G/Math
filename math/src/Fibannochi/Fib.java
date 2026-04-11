package Fibannochi;

public class Fib {

	public static void main(String[] args) {
		Fib f = new Fib();
		System.out.println(f.fib2(9));

	}
	
	
	public int c = 0;
	public int b = 0;
	public int a = 1;
	public int fib(int n) {
		Fib f = new Fib();
		f.c = f.b;
		f.b = f.b+f.c;
		f.b = f.a;
		if(0 <= n) {
			System.out.println(f.a);
			f.fib(n-1);
			
		}
		
		
		
		return f.c;
	}
	
	public int fib2(int n) {
		int result = 0;
		Fib f = new Fib();
		if(n==1||n==2) {
			return 1;
		}else
		  {
			result = f.fib2(n-1) + f.fib2(n-2);
			System.out.println(result);
			
			return result;
		}
		
		
	}

}
