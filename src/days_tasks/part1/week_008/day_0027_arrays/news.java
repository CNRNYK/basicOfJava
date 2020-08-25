package days_tasks.part1.week_008.day_0027_arrays;

public class news {
    public static void main(String[] args) {
        String[][] teams1 = new String[2][4];

        teams1[0][0]= "Mike";
        teams1[0][1]= "Tonny";
        teams1[0][2]= "Smith";
        teams1[0][3]= "Evan";
        teams1[1][0]= "David";
        teams1[1][1]= "John";
        teams1[1][2]= "Emmy";
        teams1[1][3]= "Ryan";





        System.out.println("number of team " + teams1.length);
        System.out.println("number of first team " + teams1[0].length);  // ikinci  boyutta arama satiri
        System.out.println("number of first team " + teams1[1].length);

        System.out.println("---------------------------------");

        String[][] teams = {{"1","2","3","4"},{"1","2","3","4","5"}};
        System.out.println("number of team " + teams.length);
        System.out.println("number of first team " + teams[0].length);  // ikinci  boyutta arama satiri
        System.out.println("number of first team " + teams[1].length);
    }
}
