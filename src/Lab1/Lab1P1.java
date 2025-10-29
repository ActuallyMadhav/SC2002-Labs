package Lab1;

import java.util.Scanner;

public class Lab1P1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char choice = '0';

        System.out.print("Enter Character (A/C/D): ");
        choice = scanner.next().charAt(0);

        switch(choice){
            case 'a', 'A' -> System.out.println("Action Movie Fan");
            case 'c', 'C' -> System.out.println("Comedy Movie Fan");
            case 'd', 'D' -> System.out.println("Drama Movie Fan");
            default -> System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
