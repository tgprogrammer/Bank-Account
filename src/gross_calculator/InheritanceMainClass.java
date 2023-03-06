package gross_calculator;

public class InheritanceMainClass {
    public static void main(String[] args) {
        Tesla myCar = new Tesla();
        myCar.setColor("Red");

        String color = myCar.getColor();

        System.out.println(String.format("Hi I have Tesla with %d no. of Doors and of %s color", myCar.getNoOfDoors(), color));
    }
}
