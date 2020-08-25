package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Collections;

public class repl_0193 {
    public static void main(String[] args) {
        String[] n = new String[]{"1","2","3"};
        String[] t = new String[]{"1","2","3"};
        ArrayList<String> wordList1 = new ArrayList<String>();
        ArrayList<String> wordList2 = new ArrayList<String>();
        System.out.println(combineAL(wordList1,wordList2).toString());
        String targetWord ="";
        removeAll(wordList1,targetWord);

        combineRs(n,t);
    }

    private static void removeAll(ArrayList<String> wordList1, String targetWord) {
        for (String remove:wordList1) {
            wordList1.remove(remove);
        }
    }

    public static String combineRs(String[] r1,String[] r2) {
        ArrayList<String> combine = new ArrayList<String>();
        String export="";
        Collections.addAll(combine, r1);
        Collections.addAll(combine, r2);
        for (String full:combine) {
            export = export + full;
        }
        //System.out.println(export);
        
        return combine.toString();
    }
    public static ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> combine = new ArrayList<String>();
        for (String full:wordList1) {
            combine.add(full);
        }
        for (String full:wordList2) {
            combine.add(full);
        }
        return combine;

    }
}
