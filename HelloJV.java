import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HelloJV {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scn.nextLine();
        System.out.println("Hello: "+ name);
    }
}
