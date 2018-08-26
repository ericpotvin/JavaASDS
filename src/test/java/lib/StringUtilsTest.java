package lib;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "a,3,aaa",
            "ab,3,ababab",
            "a,0,''",
            "a,1,a",
    })
    void repeat(String str, int number, String expected) {
        assertEquals(expected, StringUtils.repeat(str, number));
    }
}
