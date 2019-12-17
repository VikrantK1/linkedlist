public class febnoki_sum {
    public static void main(String []vk)
    {
        int x=8;
        int first=0;
        int second=1;
        int sum=0;
        int start=4;
        for (int i = 0; i <=x ; i++) {
            int temp=second;
           // System.out.println(first);
            if (i>=start)
            {
                sum+=first;
                System.out.println(first);
            }

         second=second+first;
         first=temp;

        }
       System.out.println(sum);
    }
}
