package org.launchcode;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void testEmptyBrackets() {
        String expected = "Empty brackets should be balanced";
        String actual = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //test 1
    @Test
    public void testUnbalancedLeftBracket() {
        String expected = "Unbalanced left bracket should be false";
        String actual = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
//test2
    @Test
    public void testBracketsWithTextInBetween() {
        String expected = "Text inside brackets should not affect balance";
        String actual = "[LaunchCode]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
//test 3
    @Test
    public void testTextOutsideBrackets() {
        String expected = "Text outside brackets should not affect balance";
        String actual = "Launch[World]!";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //test 4
    @Test
    public void testEmptyString() {
        String expected = "Empty string is balanced";
        String actual = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //test 5
    @Test
    public void testWithCurlyBrackets() {
        String expected = "Curly brackets should return True";
        String actual = "{}";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }

    //test 6
    @Test
    public void testReversedBrackets() {
        String expected = "Reversed brackets should return False";
        String actual = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }

    //test 7
    @Test
    public void testOneBracket() {
        String expected = "Right bracket should return False";
        String actual = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }

    //Test8
    @Test
    public void testReversedBracketsWithString() {
        String expected = "Reversed brackets with string should return False";
        String actual = "]Launch[Code";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //Test9
    @Test
    public void testSingleSquareBracketsWithString() {
        String expected = "Single empty brackets with String should return true";
        String actual = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //Test10
    @Test
    public void testTwoPairsOfBrackets() {
        String expected = "Two different pairs of brackets returns false";
        String actual = "[]][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //Test11
    @Test
    public void testWithThreeBrackets() {
        String expected = "One pair plus single ] brackets returns false";
        String actual = "[Launch]Code]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //Test12
    @Test
    public void testTwoPairsOfSquareBrackets() {
        String expected = "Two pairs balanced brackets returns True";
        String actual = "[][]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
}