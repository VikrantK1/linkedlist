class List{
    class Node{
        int data;
        Node next;
    }
    Node head=null;
    Node tail=null;
    int size=0;
    public void push(int val)
    {
        Node node=new Node();
        node.data=val;
        node.next=head;
        head=node;
        size++;
    }
    public void pop()
    {
       if (head!=null)
       {
           head=head.next;
           size--;
       }
       else {
           System.out.print("there is no Data to Stored");
       }
    }
    public void show()
    {
        Node current=head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public void pick()
    {
        System.out.print(head.data);
    }
}



public class linked_list_Stack {
    public static void main(String[] args) {
        List list=new List();
        list.push(10);
        list.push(20);
        list.push(30);
        list.show();
        list.pop();

        System.out.println();
       list.show();
       System.out.println(list.size);
       list.pick();
    }
}
