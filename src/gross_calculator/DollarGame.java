package gross_calculator;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No. of pennies");
        int pennies = scanner.nextInt();
        System.out.println("Enter No. of nickels");
        int nickels = scanner.nextInt();
        System.out.println("Enter No. of dimes");
        int dimes =  scanner.nextInt();
        System.out.println("Enter No. of quarters");
        int quarters = scanner.nextInt();

        scanner.close();

        double result = pennies * 0.1 + nickels * 0.5 + dimes * 0.10 + quarters * 0.25;
       if (result < 1) {
            System.out.println("You lost by under " + String.format("%.2f", (1 - result)));
        }
        else if(result > 1) {
            System.out.println("You lost by over " + String.format("%.2f", (result - 1)));
        }
        else {
               System.out.println("Congratulations! You won");
            }
    }
}
