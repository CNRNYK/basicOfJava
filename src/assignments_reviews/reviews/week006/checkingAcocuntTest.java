package assignments_reviews.reviews.week006;

public class checkingAcocuntTest {
    public static void main(String[] args) {
        CheckingAccount clientOne = new CheckingAccount();
        int x = 5;
        String str = "apple";

        clientOne.accountNumber = 123412341234L;
        clientOne.accountHolder = "Mike";
        clientOne.balance = 500.0;

        clientOne.getAccountInfo();

        // create another account

     CheckingAccount clientTwo = new CheckingAccount();


     clientTwo.setInfo(300, 123412341234L , "caner");

     clientTwo.accountNumber = 123112341234L;
     clientTwo.accountHolder = "Camer";
     clientTwo.balance = 450.0;

     clientTwo.getAccountInfo();

     clientOne.deposit(300);
     clientOne.getAccountInfo();

     clientOne.withdraw(100);
     clientOne.getAccountInfo();

     CheckingAccount myAccount = new CheckingAccount();
     myAccount.setInfo(200 , 123412341234L , "Nayk");
     System.out.println("Current balance : " +  myAccount.balance);
     myAccount.deposit(100000);
     myAccount.getAccountInfo();


    }
}
