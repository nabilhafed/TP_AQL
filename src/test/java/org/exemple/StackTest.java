package org.exemple;
import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class StackTest {
    private Stack stack ;


    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }
    @Test
    public void pushTestAddElement(){
        stack.push(15);  //pusher un element
        int element = stack.peek() ;    // vérifier l'etat de la pile avec peek
        Assertions.assertEquals(15,element);

        int size = stack.size() ;
        Assertions.assertEquals(1,size);

        System.out.println(stack.toString());
    }
    @Test
    public void popExeceptionTest(){
        int element = stack.pop() ;
        Assertions.fail("le test est correct ") ;
    }
    @Test
    public void popElementFromStackTest()
    {
        stack.push(15);
        stack.push(10);
        int elementButtom =  stack.pop() ;
        Assertions.assertEquals(10,elementButtom);

        int size = stack.size() ;
        Assertions.assertEquals(1,size);

    }
    @Test
    public void sizeStackTest(){

        int size = stack.size() ;
        Assertions.assertEquals(0,size);

        stack.push(20);
        String serializedString = Arrays.toString(stack.getArray());
        System.out.println(serializedString); // Affiche : "[1, 2, 3, 4, 5]"


    }
}
