package org.exemple;


import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("III");

        Assertions.assertEquals(3, result);
    }

}
