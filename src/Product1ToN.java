import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PRAKASH on 9/9/14.
 */
public class Product1ToN {

    public static void main(String args[])  {
        System.out.println("Enter the value of the n :");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= 0,product=1;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=1;i<=n;i++)
        {
            product=product*i;
            //System.out.print(i+"----"+product);
        }
        System.out.println("product from 1 to --" +n+"-- is --"+product);
}

}
