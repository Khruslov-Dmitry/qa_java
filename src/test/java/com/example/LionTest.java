package com.example;

import org.junit.Assert;
import org.junit.Test;


public class LionTest {

    @Test
    public void getKittensReturnCorrectValue() throws Exception {

        Lion lion = new Lion("Самка");
        int expectedKittensCount = 1;
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void doesHaveMane() {
    }

    @Test
    public void getFoodReturnCorrectValue() {
    }
}
