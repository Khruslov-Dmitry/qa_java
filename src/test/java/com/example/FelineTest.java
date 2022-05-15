package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        // Arrange
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Act
        List<String> actualFood = feline.eatMeat();

        // Assert
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        // Arrange
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        // Act
        String actualFamily = feline.getFamily();

        // Assert
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensDefaultConstructorReturnsCorrectValue() {
        // Arrange
        Feline feline = new Feline();
        int expectedKittensCount = 1;

        // Act
        int actualKittensCount = feline.getKittens();

        // Assert
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensExtendedConstructorReturnsCorrectValue() {
        // Arrange
        Feline feline = new Feline();
        int expectedKittensCount = 3;

        // Act
        int actualKittensCount = feline.getKittens(3);

        // Assert
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
