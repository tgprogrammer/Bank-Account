package gross_calculator;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        //1.randomly generate any number between 1 to 6
        //2.initialize a count variable to 0
        //3.add the random number to the variable in each iteration.
        //4.once the total hits 20 the user wins otherwise show the error message
        Random random = new Random();

        int count = 0;
        for(int i=0; i< 5; i++) {
            int diceNum = random.nextInt(6) + 1;
            count = count + diceNum;
            System.out.println(String.format("Roll #%d: You 've rolled a %d", i, diceNum));
            if(count == 20) {
                System.out.println("Congratulations! you won");
                break;
            }
            else if(count > 20){
                System.out.println("Oops! there is a bug");
                break;
            }
            else if(i == 4 && count < 20) {
                System.out.println("You lost by " + (20 - count) + " spaces");
            }
            else {
                int spaceToGO = 20 - count;
                System.out.println("You have left " + spaceToGO + " spaces");
            }
        }
    }
}
