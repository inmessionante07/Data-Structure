package Array.Basic;

import java.util.Scanner;

public class ArrayFor {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {// for(element : )
            System.out.print(i + " ");
        }
        sc.close();
    }
}
