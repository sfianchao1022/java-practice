public class ExampleTest {
    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);

        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);

        ListNode node7=new ListNode(7);

        Linkedlist list1=new Linkedlist();
        list1.create();
        list1.add(node1);
        list1.add(node2);
        list1.add(node3);
        System.out.println("list number : "+list1.getListNum());
        list1.printLinkedlist();

        Linkedlist list2=new Linkedlist();
        list2.create();
        list2.add(node4);
        list2.add(node5);
        list2.add(node6);
        System.out.println("list number : "+list2.getListNum());
        list2.printLinkedlist();

        ListNode delNode1=list2.delete(new ListNode());
//        ListNode delNode2=list2.delete(new ListNode());
//        ListNode delNode3=list2.delete(new ListNode());
//        ListNode delNode4=list2.delete(new ListNode());
        System.out.println("list number : "+list2.getListNum());
        list2.printLinkedlist();
        if(list2.front==null&&list2.rear==null){
            System.out.println("This list is empty");
        }

        list2.add(node7);
        System.out.println("list number : "+list2.getListNum());
        list2.printLinkedlist();

        mergeTwoLists(list1,list2);
    }

    public static void mergeTwoLists(Linkedlist l1, Linkedlist l2) {
        Linkedlist mergeList=new Linkedlist();
        mergeList.create();
        while(l1.getListNum()!=0||l2.getListNum()!=0){
            mergeList.add(l1.delete(new ListNode()));
            mergeList.add(l2.delete(new ListNode()));
        }
        mergeList.printLinkedlist();

    }
}
