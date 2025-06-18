import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // Step 1
        System.out.print("Enter a number: ");
        int num = sc.nextInt();                                  // Step 2
        sc.close();

        int original = num;                                      // Step 3
        int result = 0;                                          // Step 4

        while (num != 0) {                                       // Step 5
            int digit = num % 10;                                // Step 5.1
            result += digit * digit * digit;                     // Step 5.2
            num = num / 10;                                      // Step 5.3
        }

        if (original == result) {                                // Step 6
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
