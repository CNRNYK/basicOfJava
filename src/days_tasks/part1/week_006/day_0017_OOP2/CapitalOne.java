package days_tasks.part1.week_006.day_0017_OOP2;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        System.out.println(acc1 + " "+  acc2);

        acc1.accountHolder = "Caner NAYKI";
        acc1.accountNumber = 122223654;
        acc1.deposit(250);

        acc1.showBalance();

        acc1.withDraw(100);

        acc1.showBalance();

        acc1.charge(50, "table");

        acc1.showBalance();
    }
}
