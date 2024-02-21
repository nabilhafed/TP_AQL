package org.exemple;

import com.sun.source.tree.UsesTree;
import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    private Factorial factorial ;
    @BeforeEach
    public void setup(){
        factorial = new Factorial() ;
    }
    @Test
    public void factorialLessZeroTest()
    {
        int result = factorial.factorial(-1) ;
    }
    @Test
    public void factorialNumber()
    {
        int result = factorial.factorial(4) ;
        Assertions.assertEquals(24,result);

        result = factorial.factorial(0) ;
        Assertions.assertEquals(1,result);
    }
}
