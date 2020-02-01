package add_two_numbers;

public class Stack extends Linkedlist{
	
	public Node top;
	public int data;
	
	public Stack() {
		
	}
	
	public void create() {
		top=front=rear=null;
	}
	
	public int pop(Linkedlist l) {
		
		System.out.println(" ");
		
		Linkedlist s=l;
		//s.printLinkedlist();
		
		top=s.front;
		data=top.val;
		top=top.listNode;
		
		//System.out.println(data);
		
		return data; 
	}
}
