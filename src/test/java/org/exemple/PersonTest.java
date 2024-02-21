package org.exemple;

import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void PersonShouldBeAdult() {
        Person p = new Person("A","B",18);
        boolean isAdult = p.isAdult() ;
        Assertions.assertEquals(true,isAdult);
    }
    @Test
    public void PersonShouldBeNotAdult() {
        Person p1 = new Person("A","B",17);
        boolean isAdult = p1.isAdult() ;
        Assertions.assertEquals(false,isAdult);
    }
    @Test
    public void PersonFirstLastName() {
        Person p2 = new Person("A","B",17);
        String result = p2.getFullName();
        Assertions.assertEquals("A B",result);
    }

}
