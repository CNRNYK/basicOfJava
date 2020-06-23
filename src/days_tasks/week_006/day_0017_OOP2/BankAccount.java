package days_tasks.week_006.day_0017_OOP2;

public class BankAccount {
    double balance;
    String accountHolder;
    int accountNumber;

    public void deposit(double amount){
        System.out.println("depositing $ " + amount + " to " + accountNumber);
        balance+=amount;

    }
    public void withDraw(double amount){
        System.out.println("Withdrawing " + amount + " from " + accountNumber);
        if (balance<0){
            balance= 35;
        }
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("------------------------");
        System.out.println("account holder: " +accountHolder);
        System.out.println("account number: " +accountNumber);
        System.out.println("balance: " + balance);
        System.out.println("------------------------");
    }

    public void charge(double price , String item){
        if (balance>=price){
            balance = balance-price;
            System.out.println("buying " + item + " for $ " + price + " from " +accountNumber );
        }else System.out.println(" insufficiant funds to purchase " + item + " from " + accountNumber);
    }

}
