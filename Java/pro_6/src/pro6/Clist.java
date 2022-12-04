package pro6;

public class Clist {
	
	class Node{
		int data;
		Node next;
		
		// cons
		Node(int x){
			this.data=x;
			this.next=null;
		}
	};
	
	// declare head & tail pointer to null
	public Node head = null;
	public Node tail = null;
	
	// function to insert element
	public void insert(int ele) {
		Node temp = new Node(ele);
		
		// if list is empty
		if(head==null) {
			head= temp;
			tail = temp;
			tail.next = head;
		}
		
		// if at least one element is present
		tail.next = temp;
		tail=temp;
		tail.next=head;
	}
	
	// function to display elements
	public void display() {
		if(head==null) return;	// empty
		
		System.out.print("Data: ");
		
		Node point = head;
		while(point.next != head) {
			System.out.print(point.data + " ");
			point = point.next;
		}
		System.out.print(point.data);
	}
	

	public static void main(String[] args) {
		
		Clist n1 = new Clist();
		
		n1.insert(3);
		n1.insert(4);
		n1.insert(5);
		n1.insert(6);
		n1.insert(7);
		
		n1.display();
		
	}

}
