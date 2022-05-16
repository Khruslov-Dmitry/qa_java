package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSoundReturnsCorrectValue() {

        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testGetFood() {
    }
}
