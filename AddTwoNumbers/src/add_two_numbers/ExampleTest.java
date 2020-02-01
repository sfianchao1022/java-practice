package add_two_numbers;

public class ExampleTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1=new Node(2);
		Node node2=new Node(4);
		Node node3=new Node(3);
		Node node4=new Node(5);
		Node node5=new Node(6);
		Node node6=new Node(4);
		
		//若Linkedlist不new的話 Linkedlist的class要用static method
		//Linkedlist.create();
		System.out.println("list1 ");
		Linkedlist list1=new Linkedlist();//製作list1
		list1.create();
		list1.add(node1);
		list1.add(node2);
		list1.add(node3);
		list1.printLinkedlist();
		
		System.out.println(" ");
		System.out.println("list2 ");
		Linkedlist list2=new Linkedlist();//製作list2
		list2.create();
		list2.add(node4);
		list2.add(node5);
		list2.add(node6);
		list2.printLinkedlist();
		
		//linkedlist存成stack 再pop
		Stack listWithStack=new Stack();
		int output=listWithStack.pop(list1);
		System.out.println("stack pop : "+output);
		
		AddTwoNumbers.solution(list1, list2);

	}

}
