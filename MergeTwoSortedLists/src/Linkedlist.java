import java.util.List;

public class Linkedlist {

    public ListNode front;
    public ListNode rear;

    public ListNode count;

    public int nodeNum=0;

    public Linkedlist() {

    }

    public void create() {
        front=rear=null;
    }

    public void add(ListNode newNode) {

        System.out.println("newNode val : "+newNode.val);

        if(rear==null) {//front==rear==null 尚未加入任何node
            front=rear=newNode;
        }else {
            rear.next=newNode;//rear指向加入的node(Node next)
            rear=newNode;//rear移到加入的node 變成最後一個node
            System.out.println("rear!=front");
        }
        System.out.println("front val : "+front.val);
        System.out.println("rear val : "+rear.val);
        ++nodeNum;
//        System.out.println("node number : "+ ++nodeNum);

    }

    public ListNode delete(ListNode deleteNode){

        if(front==null){
            front=rear=null;
            System.out.println("queue empty, no node to delete");

        }else{
            deleteNode=front;
            front=front.next;
            System.out.println("delete node val : "+deleteNode.val);
            --nodeNum;
        }
        return deleteNode;
    }

    public void printLinkedlist() {

        System.out.println("LinkedList: ");

        if(rear!=null) {
            //從front開始scan 依序print value
            count=front;
            while(count!=null) {
                System.out.print(count.val+" ");//System.out.print 輸出不換行
                count=count.next;
            }

        }else {
            System.out.println("front==rear");
        }

        System.out.println(" ");

    }

    public Linkedlist reverse(Linkedlist l) {
        Linkedlist rlist=new Linkedlist();

        return rlist;
    }

    public void getFrontValue() {

        System.out.println("front value : "+front.val+" ");

    }

    public void getRearValue() {

        System.out.println("rear value : "+rear.val+" ");

    }

    public int getListNum(){
        return nodeNum;
    }
}
