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
}
