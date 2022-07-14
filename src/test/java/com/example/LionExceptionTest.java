package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeExpectException() {

        String expectedMsg = "Используйте допустимые значения пола животного - самец или самка";

        try {
            Lion lion = new Lion("xxx", feline);
            Assert.fail("Expect Exception");
        } catch (Exception exception) {
            assertEquals(expectedMsg, exception.getMessage());
        }
    }
}
