package days_tasks.week_010.day_0035;

public class employeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Tedd",2345);
        Employee e3 = new Employee("Tedd",2345,"sales","sales person");


        System.out.println(e1.getName()+"|"+ e1.getIdNumber()+"|" + e1.getDepartment() + "|" +e1.getPosition());
        System.out.println(e2.getName()+"|"+ e2.getIdNumber()+"|" + e2.getDepartment() + "|" +e2.getPosition());
        System.out.println(e3.getName()+"|"+ e3.getIdNumber()+"|" + e3.getDepartment() + "|" +e3.getPosition());

        e1.setName("caner");
        e1.setDepartment("test");
        e1.setPosition("tester");
        System.out.println(e1.getPosition());
        System.out.println(e1.getName()+"|"+ e1.getIdNumber()+"|" + e1.getDepartment() + "|" +e1.getPosition());
        System.out.println("-----------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }
}
