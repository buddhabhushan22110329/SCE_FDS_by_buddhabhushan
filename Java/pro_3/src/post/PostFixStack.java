package post;
import java.util.*;

public class PostFixStack {

	public static void main(String[] args) {
		// a string will be given evaluate its postFix 
		// postFix-> operators comes after operands
		
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine();
		
		System.out.println("Given expression is: " + str);
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') st.push(ch-'0');
			else {
				int a = st.peek();
				st.pop();
				int b = st.peek();
				st.pop();
				
				if(ch=='*') st.push(b*a);
				else if(ch=='+') st.push(b+a);
				else if(ch=='-') st.push(b-a);
				else st.push(b/a);
			}
		}
		
		System.out.println("PostFix of given expression is: " + st.peek());
		
	}

}