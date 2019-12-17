import java.util.Scanner;

class Node{
    int value;
    Node next;
    Node prev;
        }
class Linklist{
    Node head=null;
    Node prev=null;
    public void insert(int value)
    {
        Node node1=new Node();
        node1.value=value;
        node1.next=null;
        node1.prev=null;
        if (head==null)
        {
            head=node1;
            prev=null;
        }
        else
        {
            Node node2=head;
            Node temp=prev;
            while (node2.next!=null)
            {
                temp=node2.next;
                node2=node2.next;
            }
            node2.next=node1;
            node1.prev=node2.next;
        }
    }
    public void show()
    {
        Node node3=head;
        while (node3.next!=null)
        {
            System.out.println(node3.value+" "+node3.prev+" "+node3.next);
            node3=node3.next;
        }
        System.out.println(node3.value+" "+node3.prev+" "+node3.next);

    }
    public void insert_start(int value)
    {
//        if (head==null)
//        {
//            Node node45=new Node();
//            node45.value=value;
//            node45.next=head;
//            node45.prev=null;
//            Node temp=head;
//            head=node45;
//            temp.prev=null;
//        }

            Node node45=new Node();
            node45.value=value;
            node45.next=head;
            node45.prev=null;
            Node temp=head;
            head=node45;
            temp.prev=head.next;



    }
    public void insert23(int pos,int data)
    {
        if (pos==1)
        {
            insert_start(data);

        }
        else
        {
            Node node56=head;
            Node node=new Node();
            node.value=data;
            for (int i = 2; i <=pos ; i++) {
                node56=node56.next;
            }
            node56.next=node;
            node.next=node56.prev;
        }



    }
    public void deletefirst()
    {
        Node node=head;
        node=node.next;
        head=node;
    }
    public void delete_element(int pos)
    {
        if (pos==1)
        {
            head=head.next;
        }
       else
        {
            Node node=head;
            for (int i = 2; i <pos ; i++) {
                node=node.next;
            }
            Node temp=node.next;
            node.next=temp.next;
        }


    }

}
public class mylist {
    public static void main(String []vk)
    {
      // Scanner data=new Scanner(System.in);
        Linklist list=new Linklist();
        for (int i = 1; i <8 ; i++) {
        list.insert(i);
    }
        for (int i = 1; i <8 ; i++) {
            list.insert_start(i);
        }
     //   list.insert23(1,664);
       // list.delete_element(4);
       // list.insert_start(56);
        list.show();
    }
}
