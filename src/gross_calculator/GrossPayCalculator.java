package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        int noOfHours = 0;
        System.out.println("How many hours did you work ?");
        Scanner scanner = new Scanner(System.in);
        noOfHours = scanner.nextInt();
        double payRate = 0;
        System.out.println("What is you pay rate ?");
        payRate = scanner.nextDouble();
        double grossPay = noOfHours * payRate;
        System.out.println("Gross pay: " + grossPay);


    }
}
