package exercices.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromePermutationTest {

    @ParameterizedTest
    @CsvSource({
            "level",
            "evell"
    })
    void valid(String str) {
        assertTrue(PalindromePermutation.validate(str));
    }

    @ParameterizedTest
    @CsvSource({
            "bevel",
            "evelb"
    })
    void invalid(String str) {
        assertFalse(PalindromePermutation.validate(str));
    }
}
