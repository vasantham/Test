/**
 * Created by PRAKASH on 11/11/14.
 */
public class String_Functions {
    public static void main (String args[])
    {
        String str="The rains have started here";
        String str1="The rains have started here";
        String str2="The rains have not started here";
        System.out.println("The Length is : "+str.length() );
        System.out.println("Fifth index is " +str.charAt(5));
        System.out.println("First occurrence of s is "+str.indexOf("s"));
        System.out.println("Second occurrence of s is "+str.indexOf("s",9));
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str.substring(0,10));

       String temp[]=str.split(" ");
       String temp1[]=str.split(" ",2);

        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
        for(int i=0;i<temp1.length;i++)
        {
            System.out.println(temp1[i]);
        }

    }
}
