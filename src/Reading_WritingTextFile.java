import java.io.*;

/**
 * Created by PRAKASH on 11/12/14.
 */
public class Reading_WritingTextFile {
    public static void main(String args[]) throws IOException {
        File f=new File("C:\\Prakash\\read.txt");
        f.createNewFile();
        FileWriter w=new FileWriter("C:\\Prakash\\read.txt");
        BufferedWriter bw=new BufferedWriter(w);
        bw.write("Hello!! We are writing in a File!!");
        bw.newLine();
        bw.write("This is new line!!");
        bw.flush();
        FileReader r=new FileReader("C:\\Prakash\\read.txt");
        BufferedReader br=new BufferedReader(r);
        System.out.println(br.readLine());
        System.out.println(br.readLine());

    }
}
