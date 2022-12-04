package pro_9;
import java.util.*;

public class matrix {
	
	public static int minInRow(int A[][], int rowNum) {
		int mini = Integer.MAX_VALUE;
		
		for(int j=0; j< A[rowNum].length; j++) {
			if(A[rowNum][j] < mini) {
				mini = A[rowNum][j];
			}
		}
		return mini;
	}
	
	public static int maxInCol(int A[][], int j) {
		int maxi = Integer.MIN_VALUE;
		
		for(int i=0; i<A.length; i++) {
			if(A[i][j] > maxi) {
				maxi = A[i][j];
			}
		}
		return maxi;
	}
	
	public static int getColNum(int A[][], int ele) {
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				if(A[i][j] == ele) return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// perform addition, multiplication, saddle point, transpose
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int [3][3];
		int B[][] = new int [3][3];
		
		int sum[][] = new int[3][3];
		
		// take input
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}	
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				B[i][j] = sc.nextInt();
			}
		}		
		
		// addition -> both matrix should have same dimensions
		System.out.println("Addition is: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum [i][j] = A[i][j] + B[i][j];
				System.out.print(sum [i][j] + " ");
			}System.out.println();
		}
		

		
		// multiplication-> traverse rows of A & cols of B
		// Cols of A should equal to Rows of B
		
		int pro[][] = new int[3][3];
		System.out.println("Product is: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				pro [i][j] = A[i][j] * B[i][j];
				System.out.print(pro [i][j] + " ");
			}System.out.println();
		}
		
		
		// transpose-> swap rows with cols
		int trans[][] = new int [3][3];
		System.out.println("Transpose of A is: ");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				trans[i][j] = A[j][i];
				System.out.print(trans [i][j] + " ");
			}System.out.println();
		}
		
		
		// saddle point-> element which is min in its row & max in its Col
		int sp=-1;
		int r=3; int c=3;
		int i=0;
		
		while(i<r) {
			
			int minR = minInRow(A,i);
			int itsColNum= getColNum(A, minR);
			int maxC = maxInCol(A,itsColNum);
			
			if(minR == maxC) {
				sp = minR;
				break;
			}
			
			i++;
		}
		
		System.out.print("Saddle point in A is: " + sp);
	}
}