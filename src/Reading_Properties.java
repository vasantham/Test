import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by PRAKASH on 11/12/14.
 */
public class Reading_Properties {
public static void main(String args[]) throws IOException {
    System.out.println(System.getProperty("user.dir")+"\\src\\Employee.proprties");
    FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\Employee.proprties");
    Properties prop=new Properties();
    prop.load(fs);
    System.out.println(prop.getProperty("name"));
    System.out.println(prop.getProperty("age"));
    System.out.println(prop.getProperty("DOB"));
    System.out.println(prop.getProperty("city"));
    System.out.println(prop.getProperty("hobbies"));


}
}
