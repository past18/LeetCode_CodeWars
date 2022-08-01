package com.code.codeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;


public class ParserTest {

    @Test
    public void fixedTests() {
        assertEquals(1, Parser.parseInt("one"));
        assertEquals(20, Parser.parseInt("twenty"));
        assertEquals(246, Parser.parseInt("two hundred forty-six"));
    }
}