package org.exemple;

import org.example.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    private Fibonacci fibonacci ;
    @BeforeEach
    public void setUp(){
       fibonacci = new Fibonacci();
    }
        @Test
        public void fibonacciTestZero() {

            int result = fibonacci.fibonacci(0);

            Assertions.assertEquals(0, result);
        }
    @Test
    public void fibonacciTestLessZero() {
        int result = fibonacci.fibonacci(-1);
    }
    @Test
    public void fibonacciTestOne() {

        int result = fibonacci.fibonacci(1);

        Assertions.assertEquals(1, result);
    }
    @Test
    public void fibonacciTest() {
    int[] serieFib = {0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765} ;
        for (int i = 0; i < serieFib.length; i++) {
            int result = fibonacci.fibonacci(i);

            Assertions.assertEquals(serieFib[i], result);
        }
    }

}
