/**
 * Created by PRAKASH on 9/8/14.
 */
public class SumAndAveragedowhile {
    public static void main(String args[])
    {
        int sum=0;
        int i=0;
      //  while(i<=100)
//        for(int i=0;i<=100;i++)
        do
        {
            sum=sum+i;
            i++;
        }while (i<=100);
        System.out.println("sum of 100 no is --  "+sum);
        System.out.println("average of 100 no is --  "+sum/100);
    }
}
