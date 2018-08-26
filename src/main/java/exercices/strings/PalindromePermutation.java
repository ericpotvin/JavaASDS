package exercices.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Palindrome Permutation
 */
public class PalindromePermutation {

    /**
     * Validate if the string is a permuted palindrome
     * @param text The string
     * @return boolean
     */
    public static boolean validate(String text) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            if (!set.add(text.charAt(i)))
                set.remove(text.charAt(i));
        }
        return set.size() <= 1;
    }
}
