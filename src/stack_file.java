import java.util.*;
class stack_file{

    int  capicity=2;
    int stack[]=new int[capicity];
//    public stack_file(int file)
//    {
//        no_data=file;
//         stack=new int[no_data];
//    }



    int  top=0;
    public void push(int data)
    {

//        if (top==no_data) {
//
//            System.out.println("Stack is full");
//        }
//        else
//        {
//            stack[top]=data;
//            System.out.print(stack[top]+" ");
//            top++;
//
//        }
        if (size()==capicity) {
            expand();
        }

            stack[top]=data;
          //  System.out.print(stack[top]+" ");
            top++;



    }
    private   void expand()
    {
     int length=capicity;
     int new_stack[]=new int[capicity*2];
     System.arraycopy(stack,0,new_stack,0,length);
     stack=new_stack;
     capicity=length*2;
    }
    public  int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        if (top<=0) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int  pop()
    {
        int value=0;
        if (top==0) {
            System.out.print(" there is nothing to delete");

        }
        else
        {
            top--;
            value=stack[top];
            srink();
            stack[top]=0;
        }




        return value;
    }

    private void srink() {
        int length=size();
        if (length<=(capicity/2)/2)
        {
            capicity=capicity/2;
            int newstack[]=new int[capicity];
            System.arraycopy(stack,0,newstack,0,length);
            stack=newstack;
        }
    }


    public int  pick()
    {
        return stack[top];
    }
    public   void show()
    {
        for (int i=0;i<capicity;i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public  static void main(String[] args) {
     //   Scanner Scanner1=new Scanner(System.in);
    //    int value=Scanner1.nextInt();
        stack_file stack1=new stack_file();
        for (int i=0;i<5;i++ ) {
            stack1.push(i);
        }
        for (int i=0;i<=5;i++ ) {
            stack1.pop();
        }
//         System.out.println(stack1.pick());
//         for (int i=1;i<4;i++ ) {
//         	System.out.print(stack1.pop()+" ");
//         }

//           System.out.println();
//               System.out.println(stack1.pop()+" ");
//         stack1.show(3);
//        System.out.println();
//        System.out.println(stack1.size()+" ");
//        System.out.println(stack1.isEmpty());
    }
}