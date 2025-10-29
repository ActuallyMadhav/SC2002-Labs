package Lab2;
import java.util.Scanner;
import java.util.Random;

public class Lab2P1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Perform the following methods: ");
            System.out.println("1. multiplication test");
            System.out.println("2. quotient using division by subtraction");
            System.out.println("3. remainder using division by subtraction");
            System.out.println("4. count the number of digits");
            System.out.println("5. position of a digit");
            System.out.println("6. extract odd digits");
            System.out.println("7. quit");
            choice = sc.nextInt();

            switch(choice){
                case 1: /* add mulTest() call */
                    mulTest(); // works
                    break;
                case 2: /* add divide() call */
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println(m + "/" + n + " = " + divide(m, n)); // works
                    break;
                case 3: /* add modulus() call */
                    System.out.print("Enter m: ");
                    int x = sc.nextInt();
                    System.out.print("Enter n: ");
                    int y = sc.nextInt();
                    System.out.println(x + "/" + y + " = " + modulus(x, y)); // works
                    break;
                case 4: /* add countDigits() call */
                    System.out.print("Enter number: ");
                    int z = sc.nextInt();
                    System.out.println("No. of digits: " + countDigits(z));
                    break;
                case 5: /* add position() call */
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    System.out.print("Enter digit to be found: ");
                    int digit = sc.nextInt();
                    System.out.println(digit + " found in " + num + " at position " + position(num, digit));
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("Enter number: ");
                    long number = sc.nextLong();
                    System.out.println("Odd digits in number: " + extractOddDigits(number));
                    break;
                case 7: System.out.println("Program terminating ...");
            }
        }while(choice < 7);
    }

    public static void mulTest(){
        int ans;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;

        for(int i = 0; i < 5; i++){
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            System.out.println("What is " + a + " times " + b + "? ");
            ans = sc.nextInt();

            if(ans == (a * b)) counter++;
        }
        System.out.println(counter + " out of 5 correct");
    }

    public static int divide(int m, int n){
        int ans = 0;

        while(m >= 0){
            m -= n;
            ans++;
        }
        return ans - 1;
    }

    public static int modulus(int m, int n){
        while(m >= 0){
            m -= n;
        }
        return m + n;
    }

    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static int position(int n, int digit){

        int position = 1;
        while(n >= 0){
            int last = n % 10;
            if(last == digit){
                return position;
            }
            n /= 10;
            position++;
        }

        return -1; // digit not found
    }

    public static long extractOddDigits(long n){
        String numStr = Long.toString(n);
        int[] digits = new int[numStr.length()];
        for(int i = 0; i < numStr.length(); i++){
            digits[i] = numStr.charAt(i) - '0';
        }
        long ans = 0;
        int k = 0;
        for(int j = digits.length - 1; j >= 0; j--){
            if(digits[j] % 2 != 0){
                ans += digits[j] * Math.pow(10, k);
                k++;
            }
        }
        return ans;
    }
}
