package gross_calculator;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(20);
        System.out.println("Cake Flavour is: " + cake.getFlavour());
        System.out.println("Cake price is: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavour is: " + birthdayCake.getFlavour());
        System.out.println("Birthday cake price is: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Wedding cake flavour is: " + weddingCake.getFlavour());
        System.out.println("Wedding cake price is: "+ weddingCake.getPrice());
    }
}
