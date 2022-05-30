package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LionExceptionTest {

    @Test
    public void doesHaveManeThrowsExceptionTest() throws Exception {

        Lion lion = new Lion("");
        try {
            lion.doesHaveMane();
        } catch (Exception e) {
            assertThat(e.getMessage(), containsString("Используйте допустимые значения " +
                    "пола животного - самец или самка"));
        }
    }
}
