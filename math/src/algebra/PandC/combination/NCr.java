package algebra.PandC.combination;
import algebra.PandC.Factorial;

public class NCr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NCr a = new NCr();
		System.out.println(a.nCr(6, 7));
	}
	public int nCr(int n, int r) {
		Factorial f = new Factorial();
		if(n>r) {
			return f.fact(n)/(f.fact(n-r) * f.fact(r));
		}else {
			System.out.print("N");
			return 0;
		}
	}
}
