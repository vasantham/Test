import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/8/14.
 */
public class CheckPassFail {
    public static void main(String args[])
    {
        int mark=0;
        System.out.println("Enter your mark :");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try {
             mark=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(mark>=50)
        {
            System.out.println("Entered mark is " +mark+"--Pass");
        }
        else
        {
            System.out.println("Entered mark is " +mark+"--Fail");
        }

    }
}
