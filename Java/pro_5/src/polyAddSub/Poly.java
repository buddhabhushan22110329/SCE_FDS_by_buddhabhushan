package polyAddSub;

import java.util.*;
public class Poly {
	
	static int max(int n, int m) {
		if(n>m) return n;
		return m;
	}
	
	static void add(int A[], int B[], int n, int m) {
		int size = max(n,m);
		
		int i=n-1;
		int j=m-1;
		int index = size-1;
		
		int sum[] = new int[size];
		
		while(i>=0 && j>=0) {
			sum[index--] = A[i--] + B[j--];
			
		}
		
		while(i>=0) {
			sum[index--] = A[i--];
		}
		
		while(j>=0) {
			sum[index--] = B[j--];
		}
		
		// addition is done now
		// print sum array
		int pow = size-1;
		
		for(int k=0; k<size; k++) {
			System.out.print(sum[k] + "x^" + pow);
			if(k!=size-1) System.out.print(" + ");
			pow--;
		}
	}
	
		public static void main(String [] args) {
			// perform addition & subtraction of polynomial using array
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			int m = sc.nextInt();
			
			int A[] = new int[n];
			int B[] = new int[m];
			
			for(int i=0; i<n; i++) {
				A[i] = sc.nextInt();
			}
			
			for(int i=0; i<m; i++) {
				B[i] = sc.nextInt();
			}
			
			add(A,B,n,m);
		}
}