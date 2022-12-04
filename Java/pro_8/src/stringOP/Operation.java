package stringOP;
import java.util.*;

public class Operation {
	
	// check if palindrome
	public static boolean IsPalindrome(String str, int n) {
		
		int s=0;
		int e=n-1;
		
		while(s<=e) {
			if(str.charAt(s++) != str.charAt(e--)) return false;
		}
		
		return true;
	}
	
	
	
	// concat function
	public static void con() {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		//int index = s1.length();
		int i=0;
		int m = s2.length();
		
		while(i < m) {
			s1 += s2.charAt(i);
			i++;
		}
		
		System.out.println("Concanated string is: " + s1);
	}
	
	
	public static int occ() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String sub = sc.nextLine();
		
		int cnt=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == sub.charAt(0)) {
				
				int n = sub.length();
				int index=i;
				int j=0;
				boolean flag = true;
				
				while(j<n ) {
					if(sub.charAt(j) != str.charAt(index)) {
						flag = false;
						break;
					}
					j++;
					index++;
				}
				
				if(flag==true && index <=str.length()) cnt++;
				
			}
		}
		
		return cnt;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		boolean ans = IsPalindrome(str, str.length());
		
		if(ans==true) System.out.println(str + " is a palindrome");
		if(ans==false) System.out.println(str + " is not a palindrome");
		
		con();
		
		
		int cnt = occ();
		System.out.println(cnt);
	}

}
