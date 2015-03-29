/**
 * Created by PRAKASH on 9/11/14.
 */
public class CozaLozaWoza {
    public static void main(String args[])
    {
        for(int i=1;i<110;i++)
            if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.print("Loza");
            } else if (i % 7 == 0) {
                System.out.print("Woza");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("Coza");
            } else if (i % 11 == 0) {
                System.out.print(i);
                System.out.println();
            }
        else{
                System.out.print(i);
            }
    }
}
