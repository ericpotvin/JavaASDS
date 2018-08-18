package datastructure.enumeration;

import org.junit.jupiter.api.Test;

import static datastructure.enumeration.EnumerationWithMethods.VALUE_1;
import static datastructure.enumeration.EnumerationWithMethods.VALUE_2;
import static datastructure.enumeration.EnumerationWithMethods.VALUE_3;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumerationWithMethodsTest {

    @Test
    void testValue() {
        assertEquals(3, EnumerationWithMethods.values().length);
        assertEquals(1, VALUE_1.getValue());
        assertEquals(2, VALUE_2.getValue());
        assertEquals(0, VALUE_3.getValue());
    }
}
