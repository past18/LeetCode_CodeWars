package com.code.codeWars;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ZerosTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(Zeros.zeros(0), is(0));
        assertThat(Zeros.zeros(6), is(1));
        assertThat(Zeros.zeros(14), is(2));
    }
}