package pro_12Package;

public class SLL_compare {
	
	public class Node{
		int data;
		Node next;
		
		// cons
		Node(int x){
			this.data=x;
			this.next=null;
		}
		
	};
	
	// Declare head & tail pointer of both bodes
	public Node head = null;
	public Node tail = null;
	/*
	public Node head = null;
	public Node tail = null;
	*/
	
	
	// fun to insert node 
	public void insert(int x) {
		Node temp = new Node(x);
		
		// base case
		if(head==null) {
			head=temp;
			tail=temp;
			tail.next = null;
			return;
		}
		tail.next=temp;
		tail=temp;
		tail.next=null;
	}
	
	// fun to display 
	public void display(Node head) {
		Node temp=head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	// fun to get length of LL
	public static int getLen(Node head) {
		int cnt=0;
		while(head!=null) {
			head=head.next;
			cnt++;
		}
		
		return cnt;
	}
	
	
	// fun to compare both SLL
	public static boolean compare(Node head1, Node head2) {
		
		// if length of both LL is not same return false
		int len1 = getLen(head1);
		int len2 = getLen(head2);
		
		if(len1 != len2) return false;
		
		while(head1!=null && head2!=null) {
			if(head1.data != head2.data) return false;
			head1=head1.next;
			head2=head2.next;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		SLL_compare n1 = new SLL_compare();
		SLL_compare n2 = new SLL_compare();
		
		n1.insert(3);
		n1.insert(4);
		n1.insert(5);
		
		n2.insert(3);
		n2.insert(4);
		n2.insert(5);	
		//n2.insert(6);	
		
		System.out.print("Data of LL1: ");		
		n1.display(n1.head);
		
		System.out.print("Data of LL2: ");
		n2.display(n2.head);
		
		
		boolean comp = compare(n1.head, n2.head);
		
		if(comp==true) System.out.print("Both linked list are same");
		if(comp==false) System.out.print("Both linked list are not same");
	}

}