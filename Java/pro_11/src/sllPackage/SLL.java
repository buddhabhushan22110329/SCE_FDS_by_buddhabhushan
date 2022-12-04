package sllPackage;

public class SLL {
	
	public class Node{
		String name;
		Node next;
		
		// cons
		Node(String name){
			this.name=name;
			this.next=null;
		}
	};
	
	// Declare head & tail pointer 
	public Node head = null;
	public Node tail = null;
	public Node p=null;	
	
	// fun to insert student name
	public void insert(String name) {
		Node temp = new Node(name);
		
		// base case
		if(head==null) {
			head=temp;
			tail=temp;
			tail.next=null;
			return;
		}
		
		tail.next=temp;
		tail=tail.next;
	}
	
	
	// fun to reverse -> iterative
	public static Node reverseIt(Node head) {
		Node curr=head;
		Node forward = null;
		Node prev = null;
		
		while(curr != null) {
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		
		return prev;
	}
	
	
	// fun to reverse -> recursive
	public static void reverseRec(Node curr, Node forward, Node prev) {
		// base case
		if(curr == null) {
			display(prev);
			return;
		}
		
		forward = curr.next;
		curr.next = prev;		
		prev = curr;
		curr = forward;
		
		reverseRec(curr, forward, prev);
	}
	
	
	// fun to display -> recursive
	public static void display(Node temp) {

		// base case
		if(temp==null) {
			System.out.println();
			return;
		}

		System.out.print(temp.name + " ");
		temp = temp.next;
		
		display(temp);

	}
	

	public static void main(String[] args) {
		
		SLL n1 = new SLL();

		n1.insert("bhushan");
		n1.insert("rajat");
		n1.insert("majahar");
		n1.insert("amol");
		
		n1.display(n1.head);
		
		//n1.p = reverseIt(n1.head);
		//System.out.print("After reversing iteratively: ");
		//n1.display(n1.p);
		
		System.out.print("After reversing recursively: ");
		reverseRec(n1.head, null, null);	
	}

}