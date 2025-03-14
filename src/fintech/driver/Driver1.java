package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;

/** 
* @author 12S23018 Early Sembiring
* @author 12S23032 Seprian Siagian
*/

public class Driver1 {
        ArrayList<Account> account = new ArrayList<>();
        ArrayList<Transaction> transaction = new ArrayList<>();
       

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            if (parts.length > 1) {
                String command = parts[0];

                switch (command) {
                    case "create-account":
                        if (parts.length == 3) {
                            String accountowner = parts[1];
                            String accountName = parts[2];
                            double balance = (parts[3]);
                            

                            account.add(new account(accountowner, accountName, balance));
                        }
                        break;

                    case "create-transaction":
                        if (parts.length == 5) {
                            int transactionid = parts[1];
                            String transcationacccountName = parts[2];
                            double amount = parts[3];
                            String postedAt = parts[4];
                            String note = parts[5];

                            transaction.add(new transcation(transactionId, transcationacccountName, transactionamount,transactionpostedAt, transactionnote));
                        }
                        break;

                
                }
            }

        }
        
           for (int i = account.size() - 1; i >= 0; i--) {
            Account account = account.get(i);
            System.out.println(course);
           }

           for (int i = transaction.size() - 1; i >= 0; i--) {
            Transaction transaction = transaction.get(i);
            System.out.println(transaction);
           }

}

