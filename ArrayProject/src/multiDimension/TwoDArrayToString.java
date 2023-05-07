package multiDimension;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        // Entering the two dimension array values in the for loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // Using the ToString method we are printing TWO dimension array

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close();

    }
}
