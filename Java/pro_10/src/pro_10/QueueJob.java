package pro_10;

class Queue{
	static int A[];
	static int front;
	static int rear;
	
	// cons
	Queue(int size){
		A = new int[size];
		front=0;
		rear=0;
	}
	
	// fun to push element in queue
	public void pushFun(int x, int size) {
		// if queue is full
		if(rear == size) {
			System.out.print("Queue is full");
			return;
		}
		
		A[rear] = x;
		rear++;
	}
	
	
	// fun to pop elements
	public  void popFun(int size) {
		// if queue is empty
		if(front==rear) {
			System.out.print("Queue is empty");
			return;
		}
		
		int temp = A[front];
		A[front] = -1;
		front++;
		if(front==rear) {
			front=0;
			rear=0;
		}
		
		System.out.print(temp + " is now removed");
	}
	
	
	// fun to display queue elements
	public  void display(int size) {
		int i = front;
		while(i != size-1) {
			System.out.print(A[i] + " ");
			i++;
		}
		System.out.println();
	}

};

public class QueueJob {
	
	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		q.pushFun(1, 5);
		q.pushFun(2, 5);
		q.pushFun(3, 5);
		q.pushFun(4, 5);
		q.display(5);
		q.popFun(5);
		q.display(5);
		
	}

}
