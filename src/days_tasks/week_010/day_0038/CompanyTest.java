package days_tasks.week_010.day_0038;

public class CompanyTest extends  Employee{
    public static void main(String[] args) {

    Employee emp = new Employee();
    FullTimeEmployee ft = new FullTimeEmployee();
    Contractor con = new Contractor();

    emp.calculatePay(40,40);
    ft.calculatePay(40,40);
    con.calculatePay(40,40);
    }
}
