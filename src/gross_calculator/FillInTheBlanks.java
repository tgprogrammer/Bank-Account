package gross_calculator;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //it allows us to take input from user
        System.out.println("What is the season of the year?");
        String season = scanner.next();
        System.out.println("Give the whole number");
        int wholeNumber = scanner.nextInt();
        System.out.println("Enter the adjective");
        String adjective = scanner.next();
        scanner.close();
        String story = "on the" + adjective + " "  + season + " "+ wholeNumber ;
        System.out.println(story);

    }
}
