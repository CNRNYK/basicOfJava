package assignments_reviews.reviews.week009;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class AccountTest {
    public static void main(String[] args) {

        //Arrays of objects
        //Unlike a tradational array that stores values like string,integer,boolean
        //
        Account obj[] = new Account[2];

        obj[0] = new Account();
        obj[1] = new Account();

        obj[0].setData(1,2);
        obj[1].setData(4,5);

        System.out.println("For array element 0 : " );
        obj[0].showData(1,2);

        System.out.println("For array element 1 : " );
        obj[1].showData(3,4);
        System.out.println("-------");
        List<Account> list = new ArrayList<>();
        list.add(new Account()); // NASIL YAZDIRACAĞIZ
        list.add(new Account());
    }
}
