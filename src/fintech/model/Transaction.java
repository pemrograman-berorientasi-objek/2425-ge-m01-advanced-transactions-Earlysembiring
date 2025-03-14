package fintech.model;

/** 
* @author 12S23018 Early Sembiring
* @author 12S23032 Seprian Siagian
*/

public class Transaction {

    private static int idCounter = 1;
    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;
    
    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = idCounter++;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
    }
    
    public int getId() {return id;}
    
    public String getAccountName() {return accountName;}
    
    public double getAmount() {return amount;}
    
    public String getPostedAt() {return postedAt;}
    
    public String getNote() {return note;}
    

    public String toString(Account account) {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note + "|" + account.getBalance();
    }
}
