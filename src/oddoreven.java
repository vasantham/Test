import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/8/14.
 */
public class oddoreven {
    public static void main(String args[])  {
        System.out.println("Enter a number :");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int number= 0;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(number%2==0){
            System.out.print(number+" -- is even");
        }
            else{
                System.out.print(number+" -- is odd");
            }

           }
}
