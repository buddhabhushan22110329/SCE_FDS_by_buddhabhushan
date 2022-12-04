package pro_14;
import java.util.*;

public class WellFormed {
	
	public static boolean solve(String str, int n) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<n; i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch=='{' || ch=='[') st.push(ch);
			
			else {
				
				if(!st.empty()) {
					if( (ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[') ) st.pop();
				}
				
				else return false;
			}
		}
		if(st.empty() == true) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		int n = str.length();
		
		boolean ans = solve(str,n);
		
		if(ans==true) System.out.print(str + " is well formed");
		if(ans==false) System.out.print(str + " is not well formed");

	}

}
