package gross_calculator;

public class ReverseString {
    public static void main(String[] args) {
        String givenString = "stop";

        for(int i = givenString.length() - 1 ; i >= 0; i--) {
            char reverse = givenString.charAt(i);
            System.out.print(reverse);
        }
    }
}
