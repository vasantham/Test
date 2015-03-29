/**
 * Created by PRAKASH on 11/6/14.
 */
public class ReverseArray {

    public static void main(String args[])
    {
      int a[]={10,20,30,40,50};
        int start=a.length;
        while (start>0)
        {
            System.out.println(a[start-1]);
            start=start-1;
        }


    }
}
