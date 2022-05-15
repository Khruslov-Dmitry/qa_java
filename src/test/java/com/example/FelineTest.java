package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {

        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {

        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensDefaultConstructorReturnsCorrectValue() {

        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensExtendedConstructorReturnsCorrectValue() {

        Feline feline = new Feline();
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(3);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
