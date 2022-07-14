package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTest {

    Feline feline;
    private final String sex;
    private final boolean expectedMane;

    public LionTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedMane, actual);
    }
}
