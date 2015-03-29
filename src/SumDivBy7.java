/**
 * Created by PRAKASH on 9/9/14.
 */
public class SumDivBy7 {
    public static void main(String args[])  {
        int sum=0;
        int avg=0;
        for(int i=1;i<=100;i++ ){

            if(i%7==0){
                avg++;
                sum=sum+i;


            }

        }
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum/avg);
    }
}
