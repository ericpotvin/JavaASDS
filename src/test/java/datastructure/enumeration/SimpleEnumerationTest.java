package datastructure.enumeration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleEnumerationTest {

    @Test
    void testValue() {
        assertEquals(3, SimpleEnumeration.values().length);
    }
}
