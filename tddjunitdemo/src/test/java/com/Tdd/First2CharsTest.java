package com.Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class First2CharsTest {

    /* TODO list for my feature
     * 1. empty char : "" => "" - success
     * 2. 1 char is A : A => "" - success
     * 3. 1 char is non A : B => B -success
     * 4. 2 chars both are A : AA => "" -success
     * 5. 2 chars first is A : AB => B -success
     * 6. 2 chars second is A : BA => B -success
     * 7. 2 chars non is A : BD => BD -success
     * 8. n chars first is A : ABCDE => BCDE -success
     * 9. n chars second is A : BACDE => BCDE -success
     * 10. n chars first & second both A => AACDE => CDE -success
     * 11. n chars first & second non A => BCDEA => BCDEA -success
     */
    First2Chars first2Chars;

    @BeforeEach
    void setUp(){
        first2Chars = new First2Chars();
    }
    @Test
    void testEmptyChar(){
        assertEquals("",first2Chars.removeIfA(""));
    }
    @Test
    void test1CharIfA(){
        assertEquals("",first2Chars.removeIfA("A"));
    }
    @Test
    void test1CharIfNonA(){
        assertEquals("B",first2Chars.removeIfA("B"));
    }
    @Test
    void test2CharsIfBothA(){
        assertEquals("",first2Chars.removeIfA("AA"));
    }
    @Test
    void test2CharsIfFirstA(){
        assertEquals("B",first2Chars.removeIfA("AB"));
    }
    @Test
    void test2CharsIfSecondA(){
        assertEquals("B",first2Chars.removeIfA("BA"));
    }
    @Test
    void test2CharsIfNonA(){
        assertEquals("BC",first2Chars.removeIfA("BC"));
    }
    @Test
    void testNCharsIfFirstA(){
        assertEquals("BCDE",first2Chars.removeIfA("ABCDE"));
    }
    @Test
    void testNCharsIfSecondA(){
        assertEquals("BCDE",first2Chars.removeIfA("BACDE"));
    }
    @Test
    void testNCharsIfFirstAndSecondBothA(){
        assertEquals("CDE",first2Chars.removeIfA("AACDE"));
    }
    @Test
    void testNCharsIfFirstAndSecondBothNonA(){
        assertEquals("BCDEA",first2Chars.removeIfA("BCDEA"));
    }
}
