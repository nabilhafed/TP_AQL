package org.exemple;

import org.example.Prime;
import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    private Prime prime  ;
    @BeforeEach
    public void setup()
    {
        prime = new Prime() ;
    }
    @Test
    public void PrimeLessTow() {
        boolean result = prime.isPrime(1) ;

        Assertions.assertFalse(result);
    }
    @Test
    public void PrimeListPrimeNumber() {
        int[] listePrime = {5,7,11,13,17,31} ;
        boolean result ;
        for (int i = 0; i < listePrime.length; i++) {
            result = prime.isPrime(listePrime[i]) ;
            Assertions.assertTrue(result);

        }
    }
}
