package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getSound_return_correct_value() {

        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }
}
