import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/8/14.
 */
public class PrintNumberInWord {
    public static void main(String args[])
    {        int var=0;
        System.out.println("Enter your number :");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try {
            var=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(var==0)
       System.out.println("Entered number is Zer0!!");
        else if(var==1)
            System.out.println("Entered number is one!!");
        else if(var==2)
            System.out.println("Entered number is two!!");
        else if(var==3)
            System.out.println("Entered number is three!!");
        else if(var==4)
            System.out.println("Entered number is four!!");
        else if(var==5)
            System.out.println("Entered number is five!!");
        else if(var==6)
            System.out.println("Entered number is six!!");
        else if(var==7)
            System.out.println("Entered number is seven!!");
        else if(var==8)
            System.out.println("Entered number is eight!!");
        else if(var==9)
            System.out.println("Entered number is nine!!");
        else if(var==10)
            System.out.println("Entered number is Ten!!");
        else
                System.out.println("Entered number is Other!!");


    }

}
