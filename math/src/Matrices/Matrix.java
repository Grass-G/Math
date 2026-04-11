
package Matrices;


public class Matrix {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Matrix a = new Matrix();
		int[][] x = a.matrix1(4, 2, 1, 5);
		int[][]	y = a.matrix1(2, 5, 3,11);
		a.matrixPrint(x);
		System.out.println("*");
		a.matrixPrint(y);
		System.out.println("=");
		a.matrixPrint(a.matrixMult(x,y));

	}
	
	public int[][] matrix1(int n,int m,int lHScoefficient, int rHScoffecient){
		int[][] test = new int[n][m];
		
		for(int b = 0; b < n; b++) {
			//System.out.print("|");
			for(int c = 0; c < m; c++) {
				test[b][c] = ((rHScoffecient*(b+1)/(lHScoefficient*(c+1))));
				//System.out.print(test[b][c]);
				if(c<m-1) {
				//System.out.print(",");
				}
			}
			//System.out.println("|");
		}
		return test;
	}
	public int[][] matrixPrint(int[][] x){
		int n = x.length;
		int m = x[0].length;
		
		for(int b = 0; b < n; b++) {
			System.out.print("|");
			for(int c = 0; c < m; c++) {
				System.out.print(x[b][c]);
				if(c<m-1) {
				System.out.print(",");
				}
			}
			System.out.println("|");
		}
		return x;
	}
	public int[][] matrixAdd(int[][] x, int[][] y){
		int n = x.length;
		int m = x[0].length;
		
		int n1 = y.length;
		int m1 = y[0].length;
		
		int[][] result = new int[n][m];
		
		if(n == n1 && m == m1) {
			for(int b = 0; b < n; b++) {
				
				//System.out.print("|");
				for(int c = 0; c < m; c++) {
					
					result[b][c] = x[b][c]+y[b][c];
					
					//System.out.print(test[b][c]);
					if(c<m-1) {
					//System.out.print(",");
					}
				}
				//System.out.println("|");
			}
		}
		
		return result;
	}
	public int[][] sclrMult(int[][] x, int y){
		int n = x.length;
		int m = x[0].length;
		
		
		int[][] result = new int[n][m];
		
		
			for(int b = 0; b < n; b++) {
				
				//System.out.print("|");
				for(int c = 0; c < m; c++) {
					
					result[b][c] = x[b][c]*y;
					
					//System.out.print(test[b][c]);
					if(c<m-1) {
					//System.out.print(",");
					}
				}
				//System.out.println("|");
			}
		
		
		return result;
	}
	
	
//===========================================================================================================	
	
	
	public int[][] matrixMult(int[][] x, int[][] y){
		Matrix mat = new Matrix();
		
		int n = x.length;//imp
		int m = x[0].length;
		
		int n1 = y.length;
		int m1 = y[0].length;//imp
		
		int[][] result = new int[n][m1];
		
		int[][] temp = mat.r1(n, m1, x, 0);  
		int[][] temp1 = mat.c1(n, m1, y, 0);
		
		int[][] temp2 = mat.r1(n, m1, x, 1);  
		int[][] temp22 = mat.c1(n, m1, y, 1);
		int[][] s1 = mat.matrixMulti(temp, temp1);
		int[][]	s2 = mat.matrixMulti(temp2, temp22);
		
		for(int ii = 0; ii < x[0].length; ii++) {
			
			 temp = mat.r1(n, m1, x, ii);  
			 temp1 = mat.c1(n, m1, y, ii);
			
			result =mat.matrixAdd(result, mat.matrixMulti(temp, temp1)) ;
		}
		
		
		return result;
	}
	
	
	
	
	public int[][] r1(int n,int m1, int[][] x, int index){
		int[][] tmp = new int[n][m1];
		for(int a = 0;a<n;a++ ) {
			for(int a1 = 0; a1< m1 ; a1++) {
				tmp[a][a1] = x[a][index];
			}
		}
		
		return tmp;
	}
	public int[][] c1(int n,int m1, int[][] x, int index1){
		int[][] tmp = new int[n][m1];
		for(int b = 0;b<n;b++ ) {
			for(int b1 = 0; b1< m1 ; b1++) {
				tmp[b][b1] = x[index1][b1];
			}
		}
		
		return tmp;
	}
	
	public int[][] matrixMulti(int[][] x, int[][] y){
		int n = x.length;
		int m = x[0].length;
		
		int n1 = y.length;
		int m1 = y[0].length;
		
		int[][] result = new int[n][m];
		
		if(n == n1 && m == m1) {
			for(int b = 0; b < n; b++) {
				for(int c = 0; c < m; c++) {
					
					result[b][c] = x[b][c]*y[b][c];

				}
				
			}
		}
		
		return result;
	}
}