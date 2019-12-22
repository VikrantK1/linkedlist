public class questart {
    int capicity=2;
    int que[]=new int[capicity];
    int size=0;
    int fornt=0;
    int rare=0;
    public void insert(int val)
    {
        if (capicity==size)
        {
         expand();
        }
        que[rare]=val;
        rare=(rare+1)%5;
        size++;
    }

    public void expand()
    {
        int length=capicity;
        int newque[]=new int[length*2];
        System.arraycopy(que,fornt,newque,fornt,rare);
        que=newque;
        capicity=capicity*2;
    }
    public int  delete()
    {
//        int n=0;
//        while (n!=rare)
//        {
//            que[n]=que[n+1];
//            n++;
//        }
//        rare--;


        int value=que[fornt];
        que[fornt]=0;
        fornt=(fornt+1)%5;
        size--;
        return value;
    }
    public void show(){
        int n=0;
        while (n<size)
        {
            System.out.print(que[(fornt+n)%5]+" ");
            n++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        questart que1=new questart();
//        que1.insert(30);
//        que1.insert(40);
//        que1.insert(50);
        for (int i = 0; i <7 ; i++) {
            que1.insert(i);
            que1.show();
        }
        que1.show();
        que1.delete();
        que1.show();
        System.out.println(que1.size);
        System.out.println(que1.fornt);
    }
}
