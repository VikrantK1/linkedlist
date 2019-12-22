class Node{
    int data;
    Node parent;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
        parent=null;
    }
}
class  Tree{
   private Node Root=null;
    private void insert(Node node ,int value)
    {
        if (value<node.data)
        {
            if (node.left!=null)
            {
                insert(node.left,value);
            }
            else
            {
                System.out.println("Inserted "+value+" to the left of the "+node.data);
                node.left=new Node(value);
                node.left.parent=node;
            }
        }
        else if(value>node.data)
        {
            if (node.right!=null)
            {
                insert(node.right,value);
            }
            else
            {
                System.out.println("Inserted value " +value+" in the right of"+node.data);
                node.right=new Node(value);
                node.right.parent=node;
            }
        }
        else
        {
            if (node.data==Root.data)
            {
                System.out.println("Node is already here and it is Root node");
            }
            else {
                System.out.println("Node is already here" + node.data);
            }
        }


    }
    private boolean checkNode(Node node,int value)
    {
       if (node==null)
       {
           return false;
       }
       else
       {
           if (node.data!=value)
           {
               checkNode(node.left,value);
           }
          else if (node.data==value)
           {
               return true;
           }
           else
           {
               checkNode(node.right,value);
           }

       }
       return false;
    }
    public boolean checkData(int Value)
    {
        return  checkNode(Root,Value);
    }
    public void Delete(Node node,int value)
    {
        if (node==null)
        {
            return;
        }
        else
        {
            if (node.data!=value)
            {
                checkNode(node.left,value);
            }
            else if (node.data==value)
            {
                if (node.left==null && node.right==null)
                {
                    node=null;
                }
            }
            else
            {
                checkNode(node.right,value);
            }

        }
        return;
    }
    public void Delete(int value)
    {
        Delete(Root,value);
    }
    public void addNode(int value)
    {
        if (Root==null)
        {

            Root=new Node(value);
            System.out.println(Root.data+"node is root node");
        }
        else {
            insert(Root,value);
        }
    }
    private void inorderRec(Node node)
    {
        if (node==null)
            return;
        inorderRec(node.left);

       if (node==Root)
       {
           System.out.println(node.data+" and no Parent");
       }
       else
       {
           System.out.println(node.data+" and parent is"+node.parent.data);
       }
        inorderRec(node.right);

    }
    public void inorder()
    {
        inorderRec(Root);
    }
    private void PreorderRec(Node node)
    {
        if (node==null)
            return;

        System.out.print(node.data+",");
        PreorderRec(node.left);
        PreorderRec(node.right);
    }
    public void Preorder()
    {
        PreorderRec(Root);
    }
    private void PostorderRec(Node node)
    {
        if (node==null)
            return;
        PostorderRec(node.left);
        PostorderRec(node.right);
        System.out.print(node.data+",");
    }
    public void Postorder()
    {
        PostorderRec(Root);
    }
    public void Delete_Whole_tree()
    {
        Root=null;
    }
   private Node MirrorOfTree(Node node)
    {
        if (node==null)
            return node;
        Node left=MirrorOfTree(node.left);
        Node right=MirrorOfTree(node.right);
        node.left=right;
        node.right=left;

        return node;
    }
    Node temp=Root;
    public void mirror()
    {
        Root=MirrorOfTree(Root);
    }
    public void max_node()
    {
        Node temp=Root;
        while (temp.right!=null)
        {
            temp=temp.right;
        }
        System.out.println(temp.data);
    }
    public void min_node()
    {
        Node temp=Root;
        while (temp.left!=null)
        {
            temp=temp.left;
        }
        System.out.println(temp.data);
    }
    //Delete The element code
    public Node minimumElement(Node node)
    {
        if (node.left==null)
        {
            return node;
        }
        else
        {
            return minimumElement(node.left);
        }
    }
    private void DeleteNode(Node node,int Value)
    {
       if (node==null)
           return;
       if (Value<node.data)
       {
           DeleteNode(node.left,Value);
       }
       else if(Value>node.data)
       {
           DeleteNode(node.right,Value);
       }
       else
       {
           if (node.left!=null &&node.right!=null)
           {
               Node temp=node;
               Node minimum_right=minimumElement(temp.right);
               temp.data=minimum_right.data;
               DeleteNode(temp.right,minimum_right.data);
           }
           else if (node.left!=null)
           {
               System.out.println("Node deleted is"+node.data);
               node.data=node.left.data;
               node.left=null;
           }
           else if (node.right!=null)
           {
               System.out.println("Node deleted is"+node.data);
               node.data=node.right.data;
               node.right=null;
           }
           else
           {
               System.out.println("Node deleted is"+node.data);
               node.parent.left=null;
               node.parent.right=null;
           }
       }
    }
    public void delete(int Value)
    {
        DeleteNode(Root,Value);
    }

}
public class binary_tree {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.addNode(23);
        tree.addNode(21);
        tree.addNode(25);
        tree.addNode(26);
        tree.addNode(2);
//        System.out.println("\ninorder Traversion");
//        tree.inorder();
//        System.out.println("\nPreorder Traversion");
//        tree.Preorder();
//        System.out.println("\nPostorder Traversion");
//        tree.Postorder();
//        System.out.println("\n");
//        tree.max_node();
//        tree.min_node();
        tree.delete(21);
    //   tree.mirror();
        System.out.println("\ninorder Traversion");
        tree.inorder();
     //   System.out.println("\n"+tree.checkData(26));
//        System.out.println("Mirror of ");

//        System.out.println("\ninorder Traversion");
//        tree.inorder();
//        System.out.println("\nPreorder Traversion");
//        tree.Preorder();
//        System.out.println("\nPostorder Traversion");
//        tree.Postorder();
       // System.out.println("\n"+tree.checkData(26));
    }
}
