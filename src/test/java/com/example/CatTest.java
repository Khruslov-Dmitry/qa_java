package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsCorrectValue() {

        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {

        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
