package Lab1;

import java.util.Scanner;

public class Lab1P2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // salary 600 - 649, merit < 10 -> C done
        // salary 600 - 649, merit > 10 -> B done
        // salary 700 - 799, merit < 20 -> B done
        // salary 700 - 799, merit > 20 -> A done

        int salary = 0;
        int merit = 0;
        char exit = 'a';
        while(exit != 'Y'){
            System.out.print("Do you wish to Exit (Y/N): ");
            exit = scanner.next().charAt(0);
            System.out.print("Enter your salary: ");
            salary = scanner.nextInt();
            System.out.print("Enter your merit: ");
            merit = scanner.nextInt();

            //System.out.println("Salary: " + salary + ", Merit: " + merit);

            if (salary < 600 || (salary < 649 && salary > 600 && merit < 10)) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: C");
            } else if (salary > 600 && salary < 649 && merit >= 10) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: B");
            } else if (salary > 649 && salary < 700) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: B");
            } else if (salary > 700 && salary < 799 && merit < 20) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: B");
            } else if (salary > 700 && salary < 799 && merit >= 20) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: A");
            } else if (salary > 799) {
                System.out.println("Salary: " + salary + ", Merit: " + merit + " -- Grade: A");
            }
        }
        scanner.close();
    }
}
