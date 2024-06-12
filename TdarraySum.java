package Demo;
import java.util.Scanner;

public class TdarraySum {

 public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with the specified dimensions
        int[][] array = new int[rows][columns];

        // Prompt the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.print("enter the element:");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of all elements in the 2D array
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.print(array[i][j] 
            			+" ");
                sum += array[i][j];
            }
        }

        // Display the sum
        System.out.println("The sum of all elements in the 2D array is: " + sum);

        scanner.close();
    }
}

