package Mutable;

import java.util.Scanner;

public class mutuable {

    public static void passingFunction(int arr[]) {
        arr[3] = 99;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        passingFunction(arr);
        System.out.println("After the changing the value of the orginal value ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
