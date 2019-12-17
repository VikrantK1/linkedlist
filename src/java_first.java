public class java_first {
    public static int  reverse(int data)
    {
        int number=0;
        int x=0;
        while (data>0)
        {
            number=number*10+data%10;
            data/=10;
        }

        return number;
    }
    public static void main(String []vk)
    {
       System.out.println(reverse(1234));
    }
}
