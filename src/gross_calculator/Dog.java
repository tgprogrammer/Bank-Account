package gross_calculator;

public class Dog extends Animal{

    @Override
    public void makeSound () {
        System.out.println("Hi I am dog");
    }

    public void fetch() {
        System.out.println("woof");
    }
}
