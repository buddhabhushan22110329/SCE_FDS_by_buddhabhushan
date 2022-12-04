package dllPackage;

public class DLL {
	
	public class Node{
		int data;
		Node next;
		Node prev;
		
		// cons
		Node(int x){
			this.data=x;
			this.next=null;
			this.prev=null;
		}
	};
	
	// declare head & tail pointer to null
	public Node head = null;
	public Node tail = null;
	
	// function to insert at tail
	public void insert(int x) {
		// base case
		
		Node temp = new Node(x);
		
		if(head==null) {
			head=temp;
			tail=head;
			tail.next = null;
			return;
		}
		
		tail.next=temp;
		temp.prev=tail;
		tail=temp;
		tail.next=null;		
	}
	
	
	// fun to display DLL in reverse 
	public void display() {
		
		Node point = tail;
		
		while(point != head) {
			System.out.print(point.data + " ");
			point = point.prev;
		}
		
		System.out.print(point.data);
	}

	public static void main(String[] args) {
		
		DLL n1 = new DLL();
		
		n1.insert(3);
		n1.insert(4);
		n1.insert(5);
		n1.insert(6);
		n1.insert(7);
		
		n1.display();
	}

}
