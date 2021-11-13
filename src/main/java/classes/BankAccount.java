package classes;

public class BankAccount {
    String accountHolderName;
    String branchName;
    int accountNumber;
    int sortCode;
    double balance;

    //Constructor (What the class must need to create a copy)
    BankAccount(String accountHolderName, String branchName, int accountNumber, int sortCode) {
        this.accountHolderName = accountHolderName;
        this.branchName = branchName;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    void transferMoney(int amount) {

    }
    void checkBalance(){

    }
    void depositCash(int amount){
        //what to do to deposit cash


    }
    void withdrawCash(int amount){

    }
    void createDirectDebit(){

    }
    void createStandingOrder(){

    }

}
