class node34{
    int values;
    node34 next;
}
class linklist34{
    node34 head=null;
    public void insert(int data)
    {
        node34 node345=new node34();
        node345.values=data;
        node345.next=null;
        if (head==null)
        {
            head=node345;
        }
        else
        {
            node34 node3456=head;
            while (node3456.next!=null)
            {
                node3456=node3456.next;
            }
            node3456.next=node345;
        }
    }
    public void show()
    {
        node34 node3478=head;
        if (head==null)
        {
            System.out.println("No data is inserted");
        }
        else
        {
            while (node3478.next!=null)
            {
                System.out.println(node3478.values+" "+node3478.next);
                node3478=node3478.next;
            }
            System.out.println(node3478.values);
        }
    }
    public void insert_Start(int value)
    {
        node34 node=new node34();
        node.values=value;
        node.next=head;
        head=node;
    }
    public void insert_pos(int pos,int value)
    {
       if (pos==1)
       {
           insert_Start(value);
       }
       else
       {
           node34 node=new node34();
           node.values=value;
           node34 n=head;
           for (int i = 1; i <pos-1; i++) {
               n=n.next;
           }
           //  node34 temp=n.next;
           node.next=n.next;
           n.next=node;
       }
       }
       public void delete_first_node()
       {
           head=head.next;
       }
       public void delete_postion(int pos)
       {
           node34 node=head;
           node34 temp;
           int check=0;

           for (int i = 1; i <pos-1 ; i++) {
               node=node.next;
           }
           temp=node.next;
           node.next=temp.next;
       }

}
public class single_link_list{
    public static void main(String[] vk)
    {
   linklist34 linklist34=new linklist34();
        for (int i = 1; i <7 ; i++) {
            linklist34.insert(i);
        }
       // linklist34.insert_pos(2,4754);
       // linklist34.delete_first_node();
        linklist34.delete_postion(2);
   linklist34.show();
    }
}
