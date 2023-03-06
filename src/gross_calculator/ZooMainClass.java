package gross_calculator;

public class ZooMainClass {
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.fetch();

        Animal dog = new Dog();
        dog.makeSound();

        ((Dog)dog).fetch();

        dog = new Cat();
        ((Cat)dog).scratch();

        if(dog instanceof Cat catTheMeesho) {
           catTheMeesho.scratch();
        }



    }
}
