package algebra.PandC.permutation;

import algebra.PandC.Factorial;

public class NPr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NPr a = new NPr();
		System.out.println(a.nPr(5, 6));
	}
	public int nPr(int n, int r) {
		Factorial f = new Factorial();
		if(n>r) {
			return f.fact(n)/(f.fact(n-r));
		}else {
			System.out.print("N");
			return 0;
		}
	}
}
