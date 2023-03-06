package gross_calculator;

import java.util.Scanner;

public class MainRectangleClass {
    public static void main(String[] args) {
        Rectangle bathroom = getRoom();
        Rectangle kitchen = getRoom();

        double area = totalArea(bathroom, kitchen);
        System.out.println("The total area is: " + area);

    }

    public static Rectangle getRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public static double totalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
