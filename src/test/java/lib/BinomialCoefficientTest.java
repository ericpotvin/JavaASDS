package lib;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinomialCoefficientTest {

    @ParameterizedTest
    @CsvSource({
            "4,2,6",
            "5,2,10"
    })
    void name(int n, int k, int result) {
        assertEquals(result, BinomialCoefficient.compute(n, k));
    }
}
