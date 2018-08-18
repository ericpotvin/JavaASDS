package datastructure.enumeration;

/**
 * Enumeration With Values
 */
public enum EnumerationWithValues {

    VALUE_1(1),
    VALUE_2(2),
    VALUE_3(3);

    /**
     * The id
     */
    private int id;

    /**
     * Constructor
     * @param id The id
     */
    EnumerationWithValues(int id) {
        this.id = id;
    }

    /**
     * Get the ID for an enumeration
     * @return int
     */
    public int getId() {
        return id;
    }
}
