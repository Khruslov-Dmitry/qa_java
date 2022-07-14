package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSoundReturnCorrectValue() {

        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }
}
