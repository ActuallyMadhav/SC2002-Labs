package Lab1;

import java.util.Scanner;

public class Lab1P4 {
    public static void main(String[] args){
        int height = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern height: ");
        height = scanner.nextInt();
        if(height < 1){
            System.out.println("Error Input!");
        }
        String branch = "";
        for(int i = 0; i < height; i++){
            if(i % 2 != 0){
                branch += "BB";
                System.out.println(branch);
            }
            else{
                branch += "AA";
                System.out.println(branch);
            }
        }
    }
}
