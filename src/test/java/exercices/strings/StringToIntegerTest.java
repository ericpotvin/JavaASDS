package exercices.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerTest {

    @ParameterizedTest
    @CsvSource({
            "'',0",
            "a,0",
            "b,0",
            "ab,0",
            "abc,0",
            "a1b2c,12",

            "42,42",
            "-42,-42",
            "+42,42",

            "a42z,42",
            "-a42z,-42",
            "+a42z,42",
    })
    void convert(String text, long expected) {
        assertEquals(expected, StringToInteger.convert(text));
    }
}
