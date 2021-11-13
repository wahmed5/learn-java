package classes;

public class Main {
    public static void main(String[] args) {
        BankAccount waheedAccount = new BankAccount("waheed ahmed","Tooting",1234567,121416);
        //waheedAccount.depositCash(15);
        System.out.println(waheedAccount.accountHolderName);
        System.out.println(waheedAccount.branchName);
        System.out.println(waheedAccount.accountNumber);
        System.out.println(waheedAccount.sortCode);

        Calculator waheedCalculator = new Calculator ("12 cms","Black","Tesco");
        waheedCalculator.divide(1,2);
        waheedCalculator.multiply(2,3);
        waheedCalculator.subtract(5,4);
        waheedCalculator.add(2,3);



    //    BankAccount izazAccount = new BankAccount();
      //  BankAccount mamoorAccount = new BankAccount();




        //What does String class do? Use dot "." to find out.
        String myName = "Izaz Ahmed";
        myName.charAt(1);
        myName.contains("Ahmed");
        myName.isEmpty();
        myName.replace("Izaz", "Waheed");
        myName.length();
        myName.trim();
        myName.split(" "); //return 2 String -> "Izaz", "Ahmed"

    }
}
