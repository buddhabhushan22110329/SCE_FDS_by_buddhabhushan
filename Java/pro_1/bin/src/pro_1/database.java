package pro_1;
import java.util.*;

public class database {
	Scanner sc = new Scanner(System.in);
	
	String name;
	int id;
	
	public void getData() {
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter ID: ");
		this.id = sc.nextInt();
	}
	
	public void display() {
		System.out.print("Name: " + name + " ID: " + id);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		database A[] = new database[100];
		
		int choice = 0, entries=0;
		int size = A.length;
		int i=0;
		
		do {
			
			System.out.println("1. Add record\n 2. Display\n 3. Search\n 4. Delete\n 5. Exit");
			System.out.println("Choose");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				while(A[i] != null) {
					i++;
				}
				A[i] = new database();
				A[i].getData();
				entries++;
				break;
			
			case 2:
				if(entries==0) System.out.print("Empty hai");
				else {
					for(int k=0; k<entries; k++) {
						A[k].display();
					}
				}
				break;
				
			case 3:
				int temp = sc.nextInt();
				for(int k=0; k<entries; k++) {
					if(A[k].id == temp) {
						System.out.print("Found at index" + k);
					}
				}
			}	
			
			
		}while(choice < 5);

	}

}
