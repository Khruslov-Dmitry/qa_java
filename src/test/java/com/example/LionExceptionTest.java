package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionExceptionTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void doesHaveMane_throw_new_exception() throws Exception {
        expectedEx.expect(java.lang.Exception.class);
        expectedEx.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        // do something that should throw the exception...
        Lion lion = new Lion("xxx");
        lion.doesHaveMane();
    }
}
