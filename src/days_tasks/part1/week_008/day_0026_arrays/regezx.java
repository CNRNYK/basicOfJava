package days_tasks.part1.week_008.day_0026_arrays;

import java.util.Arrays;

public class regezx {
    public static void main(String[] args) {
        String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.";
        String[] arry = str.split(" ");
        System.out.println(arry.length);
        System.out.println(Arrays.toString(arry));
        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
        String[] arry2 = info1.split("xxx");
        String[] arry3 = info2.split("xxx");

        String t = arry2[1].concat(arry3[1]);
        System.out.println(t);
//        for (String  value: arry        ) {
//            System.out.println(value);
//        }
       }
}
