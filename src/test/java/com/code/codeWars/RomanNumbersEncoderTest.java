package com.code.codeWars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RomanNumbersEncoderTest {
    private final RomanNumbersEncoder romanNumbersEncoder = new RomanNumbersEncoder();
    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", romanNumbersEncoder.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", romanNumbersEncoder.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", romanNumbersEncoder.solution(6));
    }
}
