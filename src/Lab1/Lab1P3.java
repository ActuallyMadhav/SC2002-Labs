package Lab1;

import java.util.Scanner;

public class Lab1P3 {
    public static void main(String[] args){
        //1. for loop
        //2. while loop
        //3. do while loop

        int start = 0;
        int end = 0;
        int increment = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting val: ");
        start = scanner.nextInt();
        System.out.print("Enter ending val: ");
        end = scanner.nextInt();
        System.out.print("Enter increment: ");
        increment = scanner.nextInt();

        if(end <= start){
            System.out.println("Error Input!");
        }
        else {

            // for loop approach
            System.out.println("US$          S$");
            System.out.println("---------------");
            for (int i = start; i <= end; i += increment) {
                System.out.println(i + "           " + 1.82 * i);
            }
            System.out.println(" ");

            // while loop
            System.out.println("US$          S$");
            System.out.println("---------------");
            int j = start;
            while (j <= end) {
                System.out.println(j + "           " + 1.82 * j);
                j += increment;
            }
            System.out.println(" ");

            // do-while
            System.out.println("US$          S$");
            System.out.println("---------------");
            int k = start;
            do {
                System.out.println(k + "           " + 1.82 * k);
                k += increment;
            } while (k <= end);
        }
        scanner.close();
    }
}
