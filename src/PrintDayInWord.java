import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/8/14.
 */
public class PrintDayInWord {
    public static void main(String args[])
    {        int var=0;
        System.out.println("Enter your number :");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try {
            var=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (var)
        {
            case 0:
                System.out.println("Sunday!!");
                break;
            case 1:
                System.out.println("Monday!!");
                break;
            case 2:
                System.out.println("Tuesday!!");break;
            case 3:
                System.out.println("Wednesday!!");break;
            case 4:
                System.out.println("Thursday!!");break;
            case 5:
                System.out.println("Friday!!");break;
            case 6:
                System.out.println("Saturday!!");break;

            default:
                System.out.println("Not a valid day!!");
        }


    }

}