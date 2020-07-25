package assignments_reviews.reviews.week009;

public class WrapperClasses {
    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("false");
        Boolean b3 = Boolean.valueOf(false); // java 12 preffered
        Boolean b4 = Boolean.valueOf("false");

        Character c1 = new Character('a');
        Character c2 = Character.valueOf('b');

        Integer i2 = new Integer(1000);
        Integer i1 = Integer.valueOf(2000);
        Integer i3 = Integer.valueOf("2000");

        System.out.println(Integer.sum(10,12));
        System.out.println(Integer.max(12,2));
        System.out.println(Integer.min(1,523));

        //compare()
        System.out.println(Integer.compare(12,32));

        //convert() converting a String into int
        String countStr = "2134";
        int intCount = Integer.parseInt(countStr);
        System.out.println(intCount);

        int countStr2 = Integer.valueOf(countStr);
        System.out.println(countStr2);

    }
}
