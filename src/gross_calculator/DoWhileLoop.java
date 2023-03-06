package gross_calculator;

import java.util.Scanner;

//runs atleast once
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");

        int runAgain = 0;
        do {
            System.out.println("Enter the first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number");
            double secondNumber = scanner.nextDouble();

            double sum  = firstNumber + secondNumber;
            System.out.println("The sum is" + sum);
            System.out.println("Would you like to start over ? Enter 1 for yes and 2 for no");
            runAgain = scanner.nextInt();
        }
        while(runAgain == 1);
        scanner.close();
    }
}
