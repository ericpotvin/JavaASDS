package datastructure.enumeration;

/**
 * Enumeration With Methods Class
 */
public enum EnumerationWithMethods {

    VALUE_1 {
        @Override
        public int getValue() {
            return 1;
        }
    },
    VALUE_2 {
        @Override
        public int getValue() {
            return 2;
        }
    },
    VALUE_3;

    /**
     * Get the default value
     * @return int
     */
    public int getValue() {
        return 0;
    }
}
