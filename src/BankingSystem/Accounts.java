package BankingSystem;

public class Accounts extends Bank{

    double currentBalance = getBalance();

    public Accounts (int accountNo, String accountName, double balance, double interestRate) {
        super(accountNo, accountName, balance, interestRate);

    }


    public void deposit() {
        System.out.println("How much money would you like to deposit");
        double amountToDeposit = scanner.nextDouble();

        currentBalance = currentBalance + amountToDeposit;


        //update the balance in the account
        setBalance(currentBalance);
        System.out.println("your balance is: " + getBalance());

    }

    public void withdraw() {
        System.out.println("How much money would you like to withdraw");

        double moneyToWithdraw = scanner.nextDouble();
        double remainingBalance = currentBalance - moneyToWithdraw;

       while(remainingBalance < 0) {
           System.out.println("you cannot withdraw more than desired amount. Please enter the value again");
           moneyToWithdraw = scanner.nextDouble();
           remainingBalance = currentBalance - moneyToWithdraw;
        }

        setBalance(remainingBalance);

        System.out.println("your current balance is: " + remainingBalance);

    }



}
