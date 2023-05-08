package Array.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(12); // Declaring the Arraylist and the size of the ArrayList.
        // list.add(12);
        // list.add(23);
        // list.add(67);
        // list.add(98);
        // list.add(100);
        // list.add(12);
        // list.add(23);
        // list.add(67);
        // list.add(98);
        // list.add(100);

        System.out.println(list.size());
        // Adding the elements into the arraylist
        for (int i = 0; i < list.size(); i++) {

            list.add(sc.nextInt());

        }

        // System.out.println(list);
        // System.out.println(list.size());

        // list.add(45);
        // System.out.println(list);
        // System.out.println(list.size());

        // System.out.println(list.contains(23));

        // list.remove(3);
        // System.out.println(list);
        // System.out.println(list.size());
    }
}
