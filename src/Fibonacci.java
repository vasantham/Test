/**
 * Created by PRAKASH on 9/10/14.
 */
public class Fibonacci {
    static int[] a=new int[20];
    static int fibocci=0;
    public static void main(String args[])
    {
        for(int i=0;i<20;i++)
        {
            fibocci=0+i;

            a[i]=fibocci;

        }

        System.out.println("Fibonacci series are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
