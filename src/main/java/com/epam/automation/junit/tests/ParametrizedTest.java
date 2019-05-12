package com.epam.automation.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    @Parameterized.Parameters(name = "{index}: {0} / {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{{4, 2, 2}, {9, 3, 3},
                {3, 3, 1}, {10, 10, 1}});
    }

    private int firstArgument;
    private int secondArgument;
    private int result;

    public ParametrizedTest(int firstArgument, int secondArgument, int result) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.result = result;
    }

    @Test
    public void parametrizedDevide() {
        Assert.assertEquals(result, firstArgument / secondArgument);
    }
}
