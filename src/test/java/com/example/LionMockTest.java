package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnCorrectValue() throws Exception {

        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedKittensCount = 1;
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodReturnCorrectValue() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
