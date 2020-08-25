package assignments_reviews.repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_0199 {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

        removeAll(wordList,"hi");

        // now wordList is ["hey","yo"]
    }

    private static void removeAll(ArrayList<String> wordList, String targetWord) {
        for (int x = 0;x<wordList.size();x++) {
            if(wordList.get(x).equals(targetWord)){
                wordList.remove(x);
            }
        }
        System.out.println(wordList.toString());
    }
}
