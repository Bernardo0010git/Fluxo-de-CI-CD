package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void test1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test2() {
        assertTrue(5 > 1);
    }

    @Test
    void test3() {
        assertFalse(1 > 5);
    }

    @Test
    void test4() {
        assertNotNull("Biblioteca");
    }

    @Test
    void test5() {
        assertEquals("abc", "a" + "b" + "c");
    }
}