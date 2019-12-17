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
                System.out.println(node3478.values);
                node3478=node3478.next;
            }
            System.out.println(node3478.values);
        }
    }
}
public class linked_list{
    public static void main(String[] vk)
    {
   linklist34 linklist34=new linklist34();
//   linklist34.insert(56);
//   linklist34.insert(78);
//   linklist34.insert(90);
   linklist34.show();
    }
}
