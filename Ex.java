import java.util.*;
import java.io.*;
public class Ex {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();  // Tries to read an integer
        } catch (Exception e) {
            System.out.println(e);  // Catches and prints any exception
        }
        System.out.println("Program ended");
    }
}
