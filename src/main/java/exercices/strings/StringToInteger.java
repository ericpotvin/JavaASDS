package exercices.strings;

import static lib.StringUtils.isNumericChar;

/**
 * String To Integer (atoi)
 */
public class StringToInteger {

    /**
     * Convert a string to an integer
     * @param text The text string
     * @return long
     */
    public static long convert(String text) {

        if (text == null || text.length() < 1) {
            return 0;
        }

        int result = 0;
        int multiplier = 1;
        int i = 0;

        if (isSign(text.charAt(0))) {
            multiplier = text.charAt(0) == '-' ? -1 : 1;
            i++;
        }

        while(i < text.length()) {
            if (isNumericChar(text.charAt(i))) {
                result = result * 10 + text.charAt(i) - '0';
            }
            i++;
        }

        return multiplier * result;
    }

    /**
     * Check if the string has the first sign as - or +
     * @param character The character
     * @return boolean
     */
    private static boolean isSign(char character) {
        return character == '+' || character == '-';
    }
}
