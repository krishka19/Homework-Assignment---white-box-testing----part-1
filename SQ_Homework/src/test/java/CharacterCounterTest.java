package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CharacterCounterTest {

    @Test
    public void testMultipleOccurrences() {
        Assertions.assertEquals(2, CharacterCounter.countOccurrencesInString("hello", 'l'));
    }

    @Test
    public void testNoOccurrences() {
        Assertions.assertEquals(0, CharacterCounter.countOccurrencesInString("world", 'a'));
    }

    @Test
    public void testSpaceCharacter() {
        Assertions.assertEquals(1, CharacterCounter.countOccurrencesInString("java programming", ' '));
    }

    @Test
    public void testEmptyString() {
        Assertions.assertEquals(0, CharacterCounter.countOccurrencesInString("", 'e'));
    }

    @Test
    public void testNumericCharacter() {
        Assertions.assertEquals(1, CharacterCounter.countOccurrencesInString("12345", '3'));
    }

    @Test
    public void testCaseSensitivity() {
        Assertions.assertEquals(0, CharacterCounter.countOccurrencesInString("Java", 'j'));
    }

    @Test
    public void testSpecialCharacter() {
        Assertions.assertEquals(1, CharacterCounter.countOccurrencesInString("hello@world", '@'));
    }

    @Test
    public void testLongStringWithRepeatedCharacter() {
        Assertions.assertEquals(5, CharacterCounter.countOccurrencesInString("aaaaa", 'a'));
    }
    @Test
    public void testCountOccurrences_WithOccurrences() {
        // Testing path: User inputs a string with multiple instances of the character
        char[] testArray = "hello world".toCharArray();
        int count = CharacterCounter.countOccurrences(testArray, 'l');
        Assertions.assertEquals(3, count, "The character 'l' should appear 3 times.");
    }

    @Test
    public void testCountOccurrences_NoOccurrences() {
        // Testing path: User inputs a string with no instance of the character
        char[] testArray = "hello world".toCharArray();
        int count = CharacterCounter.countOccurrences(testArray, 'z');
        Assertions.assertEquals(0, count, "The character 'z' should appear 0 times.");
    }

    @Test
    public void testCountOccurrences_EmptyString() {
        // Testing path: User inputs an empty string
        char[] testArray = "".toCharArray();
        int count = CharacterCounter.countOccurrences(testArray, 'a');
        Assertions.assertEquals(0, count, "An empty string should result in 0 occurrences.");
    }

    @Test
    public void testCountOccurrencesInString_WithOccurrences() {
        // Testing the same scenario but using the wrapper method for direct string inputs
        String testString = "hello world";
        int count = CharacterCounter.countOccurrencesInString(testString, 'o');
        Assertions.assertEquals(2, count, "The character 'o' should appear 2 times.");
    }

    @Test
    public void testCountOccurrencesInString_SpecialCharacters() {
        // Testing path: User inputs a string with special characters
        String testString = "hello world!";
        int count = CharacterCounter.countOccurrencesInString(testString, '!');
        Assertions.assertEquals(1, count, "The character '!' should appear 1 time.");
    }

}
