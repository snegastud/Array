import java.util.*;
import java.io.*;
public class MainException {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();  // Tries to read an integer
            int c=a/0;
System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception occur");  // Catches and prints any exception
        }
        System.out.println("Program ended");
    }
}
