package endTermPrac;

import java.util.*;

public class reverseEachword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        // for storing reverse of a string
        String revString = "";

        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }
            revString = revString + revWord + " ";

        }
        System.out.println(revString);

    }

}