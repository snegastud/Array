import java.util.Scanner;

public class MatrixEvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows and columns (square matrix): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int even=0; int odd =0;
        System.out.println("Matrix Even or Odd Count:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]%2==0) {
                    even=even +1;
                } else {
                    odd =odd+1;
                }
            }
            System.out.println();
        }
        System.out.println("Even number count is:"+even);
        System.out.println("odd number count is:"+odd);
        sc.close();
    }
}
