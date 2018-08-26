package exercices.strings;

import static lib.StringUtils.isLetterChar;
import static lib.StringUtils.isNumericChar;

/**
 * Palindrome
 */
public class Palindrome {

    /**
     * Check if a word is a palindrome
     * @param word The string
     * @return boolean
     */
    public static boolean validateWord(String word) {
        if (word == null) {
            return false;
        }

        int len = word.length();
        if (len <= 1) {
            return true;
        }

        int half = (len / 2) - 1;
        for (int i = 0; i <= half; i++) {
            if (word.charAt(i) != word.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Validate if a phrase is a palindrome
     *
     * <p>
     *     NOTE: not the optimal solution since we do O(n) + O(n/2)
     * </p>
     *
     * <p>
     * All non alpha numeric are ignored in this validation.
     * </p>
     *
     * <p>Example of Palindrome:</p>
     * <pre>
     *     Rise to Vote, Sir.
     * </pre>
     *
     * @param phrase The phrase
     * @return boolean
     */
    public static boolean validatePhrase(String phrase) {
        if (phrase == null) {
            return false;
        }

        int len = phrase.length();
        if (len <= 1) {
            return true;
        }
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char chr = phrase.charAt(i);
            if (isNumericChar(chr) || isLetterChar(chr)) {
                str.append(chr);
            }
        }
        return validateWord(str.toString().toLowerCase()); //not optimal
    }
}