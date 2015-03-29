/**
 * Created by PRAKASH on 11/6/14.
 */
public class BigNoInArray {

    public static void main(String args[])
    {
        int a[]={1201,220,300,740,50};
        int temp=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(temp<a[i])
            {
                temp=a[i];
            }
           System.out.print(temp);
            System.out.println(a[i]);
        }
        System.out.print(temp);



    }

}
