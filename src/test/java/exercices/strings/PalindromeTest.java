package exercices.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @ParameterizedTest
    @CsvSource({
            "ab",
            "1a2"
    })
    void notValid(String str) {
        assertFalse(Palindrome.validateWord(str));
    }

    @Test
    void nullified() {
        assertFalse(Palindrome.validateWord(null));
        assertFalse(Palindrome.validatePhrase(null));
        assertTrue(Palindrome.validateWord(""));
    }

    @ParameterizedTest
    @CsvSource({
            "a",
            "aa",
            "aaa",
            "a a",
            "civic",
            "level"
    })
    void valid(String str) {
        assertTrue(Palindrome.validateWord(str));
    }

    @ParameterizedTest
    @CsvSource({
            "No, this is not a palindrome",
            "I don't know why I am trying again",
            "Now I Wan!"
    })
    void invalidPhrase(String phrase) {
        assertFalse(Palindrome.validatePhrase(phrase));
    }

    @ParameterizedTest
    @CsvSource({
            "a",
            "'Rise to Vote, Sir.'",
            "Now I Won!",
            "'A man, a plan, a canal, Panama!'",
            "Was it a car or a cat I saw?",
            "No 'x' in Nixon",
    })
    void validPhrase(String phrase) {
        assertTrue(Palindrome.validatePhrase(phrase));
    }
}
