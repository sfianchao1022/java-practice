package add_two_numbers;

public class AddTwoNumbers {
	
	public static int sum=0;
	public static int carry=0;
	public static Node curr1;
	public static Node curr2;
	
	public static void solution(Linkedlist list1,Linkedlist list2) {
		
		Linkedlist l1=list1;
		Linkedlist l2=list2;
		
		l1.printLinkedlist();
		l2.printLinkedlist();
		l1.getFrontValue();
		l2.getRearValue();
		
		curr1=l1.front;
		curr2=l2.front;
		
		Linkedlist result=new Linkedlist();
		result.create();
		
		//sum=curr1.val+curr2.val+carry;
		//result.add(new Node(sum));
		//result.add(new Node(curr1.listNode.val));
		//curr1=curr1.listNode;
		//result.add(new Node(curr1.listNode.val));
		//curr1=curr1.listNode;
		//result.add(new Node(curr1.listNode.val));
		
		
		while(curr1!=null||curr2!=null) {
			sum=curr1.val+curr2.val+carry;
			carry=sum/10;
			result.add(new Node(sum%10));
			curr1=curr1.listNode;
			curr2=curr2.listNode;
		}
		
		result.printLinkedlist();
		result.getFrontValue();
		result.getRearValue();
		
		//System.out.println(l1.front.val);
		
		
//		while(curr1!=null||curr2!=null) {
//			sum=curr1.val+curr2.val+carry;
//			if(curr1.listNode!=null||curr2.listNode!=null) {
//				curr1=curr1.listNode;
//				curr2=curr2.listNode;
//			}
//			result.add(new Node(sum));
//			carry=sum/10;
//			
//		}

	}
	
}
