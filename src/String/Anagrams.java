package String;

import java.util.Arrays;

/**
 * Created by Hivison N Moura on 29/06/2017.
 */
public class Anagrams {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        boolean anagram = true;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                anagram = false;
            }
        }

        return anagram;
    }
}
