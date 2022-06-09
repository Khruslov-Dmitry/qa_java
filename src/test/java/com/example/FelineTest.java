package com.example;

import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    @Test
    public void getFamilyReturnCorrectValue() {

        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensDefaultConstructorReturnCorrectValue() {

        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensExtendedConstructorReturnCorrectValue() {

        Feline feline = new Feline();
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(3);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
