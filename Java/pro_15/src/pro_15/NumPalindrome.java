package pro_15;
import java.util.*;

public class NumPalindrome {
	
	public static boolean check(int num) {
		// base case
		if(num <0) return false;
		
		int temp=num;
		int rev=0;
		int ld=0;
		
		while(temp > 0) {
			ld = temp % 10;
			rev = rev*10;
			rev += ld;
			temp /= 10;
		}
		
		return rev == num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean ans = check(num);
		
		if(ans==true) System.out.print(num + " is a palindrome");
		if(ans==false) System.out.print(num + " is not a palindrome");

	}

}
