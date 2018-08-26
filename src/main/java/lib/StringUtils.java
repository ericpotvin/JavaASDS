package lib;

/**
 * String Utils
 *
 */
public class StringUtils {

    /**
     * Repeat a string
     * <p>
     *     This is a solution for Java < 11
     * </p>
     * @param text The text to repeat
     * @param factor The number of times
     * @return String
     */
    public static String repeat(String text, int factor) {
        return new String(new char[factor]).replace("\0", text);
    }

    /**
     * Check if the char is numeric
     * @param character The character
     * @return boolean
     */
    public static boolean isNumericChar(char character) {
        return character >= '0' && character <= '9';
    }

    /**
     * Check if the char is a letter (a-z or A-Z)
     * @param character The character
     * @return boolean
     */
    public static boolean isLetterChar(char character) {
        return (character >= 'A' && character <= 'Z') ||
                (character >= 'a' && character <= 'z');
    }
}
