package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void doesHaveMane_returns_true_value() throws Exception {

        Lion lion = new Lion("Самец");
        boolean hasManeExpected = true;
        boolean hasManeActual = lion.doesHaveMane();
        Assert.assertEquals(hasManeExpected, hasManeActual);
    }

    @Test
    public void doesHaveMane_returns_false_value() throws Exception {

        Lion lion = new Lion("Самка");
        boolean hasManeExpected = false;
        boolean hasManeActual = lion.doesHaveMane();
        Assert.assertEquals(hasManeExpected, hasManeActual);
    }
}
