package strReversal;
import java.util.*;

public class StrRev {

	public static void main(String[] args) {
		// string will be given, reverse it using stack
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println("You entered: " + str);
		
		// Put in stack, then pop it into another string
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		String ans = "";
		
		while(!stack.empty()) {
			ans += stack.peek();
			stack.pop();
		}
		
		System.out.println("Reversed string is: " + ans);
	}


}
