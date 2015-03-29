import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/8/14.
 */
public class PrintNumberInWordSwitch {
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
            System.out.println("Entered number is Zer0!!");
                break;
            case 1:
            System.out.println("Entered number is one!!");
        break;
            case 2:
            System.out.println("Entered number is two!!");break;
            case 3:
            System.out.println("Entered number is three!!");break;
            case 4:
            System.out.println("Entered number is four!!");break;
            case 5:
            System.out.println("Entered number is five!!");break;
            case 6:
            System.out.println("Entered number is six!!");break;
            case 7:
            System.out.println("Entered number is seven!!");break;
            case 8:
            System.out.println("Entered number is eight!!");break;
            case 9:
            System.out.println("Entered number is nine!!");break;
            case 10:
            System.out.println("Entered number is Ten!!");break;
        default:
            System.out.println("Entered number is Other!!");
        }


    }

}
