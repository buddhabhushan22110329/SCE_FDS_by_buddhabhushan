package pro_2;

public class SLL {
	
	public class Node{
		String name;
		int freq;
		Node next;
		
		// cons
		Node(String name, int freq){
			this.name=name;
			this.freq=freq;
			this.next=null;			
		}
	};
	
	// declare pointers head, tail
	public Node head=null;
	public Node tail=null;
	
	
	// fun to add Item
	public void insert(String item, int freq) {
		Node temp = new Node(item,freq);
		
		// base case
		if(head==null) {
			head=temp;
			tail=temp;
			tail.next=null;
			return;
		}
		
		tail.next=temp;
		tail=temp;
		tail.next=null;
	}
	
	
	// fun to search item freq
	public void search(String item) {
		Node temp = head;
		
		while(temp!=null) {
			if(temp.name == item) {
				System.out.print(item + " has quantity: " + temp.freq);
				break;
			}
			temp=temp.next;
		}
		
		if(temp==null) System.out.print(item + " not found");
	}
	
	
	// fun to display items and freq
	public void display() {
		Node temp = head;
		
		while(temp!=null) {
			System.out.println("Item: " + temp.name + "\nQuantity: " + temp.freq);
			temp=temp.next;
		}
	}
	

	public static void main(String[] args) {
		
		SLL n1 = new SLL();
		
		n1.insert("wafers", 3);
		n1.insert("iceCream", 2);
		n1.insert("Bourn Vita", 7);
		
		//n1.display();
		n1.search("iceCream");
		
	}

}