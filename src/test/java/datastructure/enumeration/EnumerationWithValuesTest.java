package datastructure.enumeration;

import org.junit.jupiter.api.Test;

import static datastructure.enumeration.EnumerationWithValues.VALUE_1;
import static datastructure.enumeration.EnumerationWithValues.VALUE_2;
import static datastructure.enumeration.EnumerationWithValues.VALUE_3;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumerationWithValuesTest {

    @Test
    void testValues() {
        assertEquals(3, SimpleEnumeration.values().length);
        assertEquals(1, VALUE_1.getId());
        assertEquals(2, VALUE_2.getId());
        assertEquals(3, VALUE_3.getId());
    }
}
