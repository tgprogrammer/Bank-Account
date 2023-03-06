package gross_calculator;

public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Hi I am cat");
    }

    public void scratch() {
        System.out.println("meow");
    }
}
