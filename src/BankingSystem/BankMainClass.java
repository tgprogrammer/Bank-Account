package BankingSystem;

import java.util.*;

public class BankMainClass {
    public static void main(String[] args) {

        Accounts accounts = new Accounts(12345666, "Tania Goyal", 1000.00, 0.1);
        System.out.println("Current Information");
        System.out.println(accounts);

        accounts.deposit();

        accounts.withdraw();
        System.out.println("Information after deposit and withdraw");
        System.out.println(new Bank(accounts.getAccountNo(), accounts.getAccountName(), accounts.getBalance(), accounts.getInterestRate()));

        Map<String, String> bankInfoList = new HashMap();
        System.out.println("Please enter the following information with the keys and values");

        Scanner scanner = new Scanner(System.in);
        String[] infoArray = {"Name", "Email", "Mobile number"};

        System.out.println("Please Enter one by one the information");


        for(int i=0; i< infoArray.length; i++){
            System.out.println("Please Enter " + infoArray[i] + "-");
            String value = scanner.next();
            bankInfoList.put(infoArray[i], value);
        }
        scanner.close();
       bankInfoList.forEach((k, v) -> System.out.println(k + ": " + v ));


    }
}
