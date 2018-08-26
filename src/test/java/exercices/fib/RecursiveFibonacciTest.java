package exercices.fib;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveFibonacciTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "9,34",
            "42,267914296"
    })
    void fib(long number, long expected) {
        assertEquals(expected, RecursiveFibonacci.fib(number));
    }

}
