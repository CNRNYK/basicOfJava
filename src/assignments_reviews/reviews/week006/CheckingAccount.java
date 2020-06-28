package assignments_reviews.reviews.week006;

public class CheckingAccount {

    double balance;
    long accountNumber;
    String accountHolder;
    String type = "Checking account";

    public void setInfo( double pBalance , long pAccountNumber , String pAccountHolder){

        System.out.println("Settting account info ....");
        balance = pBalance;
        accountNumber = pAccountNumber;
        accountHolder = pAccountHolder;
    }

    public void getAccountInfo(){
        System.out.println("Checking account " + balance + " ," + accountNumber + ", " + accountHolder);
        System.out.println("---------------------------------------");
    }

    public void deposit( double ammount){
        System.out.println( "Depositing $ : " + ammount + " to account number : " + accountNumber);
        balance +=ammount;
    }

    public void withdraw(double ammount){
        System.out.println("Withdrawing $ : " + ammount + " from account number: " + accountNumber );
        if (ammount <= balance){
            balance -= ammount;
        }else {
            System.out.println(" Error : Insufficient Fund in account. Keep coding java");
        }
    }
    public  void purchase ( String item, double price){
        System.out.println("Purchasing " + item + " for $ : " + price);
        if (price <= balance ){
            balance -= price;

        }else  {
            System.out.println(" Insufficient Fund - Overdraft fee is applied ");
            balance -= (price+35 );
        }
        System.out.println(" Transection completed for " + item + " current balance : " + balance);
    }
}
