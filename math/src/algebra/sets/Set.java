package algebra.sets;

public class Set {

	public static void main(String[] args) {
		
		Set s = new Set();
		s.set(3, 10);
		int[] p = {23,21,4,35,12,32,54,24,2231,236};
		int[] q = {34,23,5,4,24,5,3,5,35,23}; 
		int[] r = {23,4,21,35,32,54,2231,24,236,12};
		int[] t = {23,4,21,35,32,54,24,236};
		int[] t1 = {0,1,2,3,4};
		int[] t2 = {3,4,5,6};
		System.out.print(s.union(t1,t2));

	}
	
	public int[] set(int n, int m) { 
		int[] res = new int[m+1-n];
		for(int i = 0;i<res.length;i++) {		
			res[i] = n+i;
		}
		
		return res;
	}
	public boolean isEqual(int[] x, int[] y) {
		int t2 =0;
		if(x.length == y.length) {
		for(int j = 0; j<x.length;j++) {
		for(int i = 0; i < x.length; i++) {
			if(i+1<x.length) {
			if(x[i]>x[i+1]) {
				int temp;
				temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;
			}
			}
		}
		}
		for(int j = 0; j<y.length;j++) {
		for(int i = 0; i < y.length; i++) {
				if(i+1<y.length) {
				if(y[i]>y[i+1]) {
					int temp;
					temp = y[i];
					y[i] = y[i+1];
					y[i+1] = temp;
				}
				}
		}
		}
		
		for(int p = 0; p< x.length;p++) {
			if(x[p]==y[p]) {
				t2++;
			}
		}
		if(t2==x.length) {
			return true;
		}else {
			return false;
		}
		}else {
			return false;
		}
	}
	public boolean isSubset(int[] a, int[] b) {
		int temp =0;
		for(int j = 0; j<a.length;j++) {
			for(int i = 0; i < b.length; i++) {
					if(a[j]==b[i]) {
						temp++;
					}
			}
			}
		if(temp>=a.length) {
			return true;
		}else {
		
		return false;
		}
	}
	public int[] union(int[] x, int[] y) {
		Set set1 =  new Set();
		
		int hasZer = set1.hasZero(x) + set1.hasZero(y);
		
		int[] result = new int[x.length+y.length];
		int[] actualResult;
		
		for(int j = 0; j<x.length;j++) {
			for(int i = 0; i < x.length; i++) {
				if(i+1<x.length) {
				if(x[i]>x[i+1]) {
					int temp;
					temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
				}
			}
			}
			for(int j = 0; j<y.length;j++) {
			for(int i = 0; i < y.length; i++) {
					if(i+1<y.length) {
					if(y[i]>y[i+1]) {
						int temp;
						temp = y[i];
						y[i] = y[i+1];
						y[i+1] = temp;
					}
					}
			}
			}
			for(int i =0 ; i < x.length;i++) {
				result[i] = x[i];
			}
			for(int i =0 ; i < y.length;i++) {
				result[x.length+i] = y[i];
			}
			actualResult = set1.removeRedundency(result,hasZer);
			
			for(int k = 0; k<actualResult.length;k++) {
				System.out.println(actualResult[k]);
			}
		return result;
	}
	public int[] removeRedundency(int[] x , int hasZero) {
		
		for(int i = 0; i< x.length;i++) {
			for(int j = 0; j< x.length; j++) {
				if(i!=j) {
					if(x[i]==x[j]) {
						x[i] = 0;
					}
				}
			}
		}
		for(int j = 0; j<x.length;j++) {
			for(int i = 0; i < x.length; i++) {
				if(i+1<x.length) {
				if(x[i]>x[i+1]) {
						int temp;
						temp = x[i];
						x[i] = x[i+1];
						x[i+1] = temp;
				}
				}
			}
			}
		if(hasZero == 0) {
			int temp2 =0;
			for(int i = 0; i< x.length;i++) {
				if(x[i] != 0) {
					temp2++;
				}
			}
			int[] res3 = new int[temp2];
			for(int i = 0; i< res3.length;i++) {
				res3[i] = x[(x.length-temp2)+i];
			}
			return res3;
		}else {
			int temp2 =0;
			for(int i = 0; i< x.length;i++) {
				if(x[i] != 0) {
					temp2++;
				}
			}
			int[] res3 = new int[temp2+1];
			for(int i = 0; i< res3.length;i++) {
				res3[i] = x[(x.length-temp2-1)+i];
			}
			return res3;
		}
			
		
		
	}
	public int hasZero(int[] x ) {
		int temp = 0;
		for(int i = 0; i < x.length;i++)
			if(x[i] == 0) {
				temp++;
			}
				
		return temp;
	}

}
