package com.epam.automation.junit.tests;


import com.epam.automation.junit.project.IntegerUtils;
import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;

import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MyRunner2.class)
public class CustomRuntimeTest extends BaseTest {
    private IntegerUtils integerUtils;
    private final int a = 6;
    private final int b = 2;
    private final int expectedSum = 8;
    private final int expectedDevide = 3;
    private final int expectedMultiple = 12;

    @Before()
    public void setUp() throws Exception {
        System.out.println("Before method " + testName.getMethodName());
        integerUtils = new IntegerUtils();
    }

    @After
    public void cleanUp() throws Exception {
        System.out.println("After method " + testName.getMethodName());
        integerUtils = null;
    }

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test(timeout = 100)
    public void sum() {
        Assert.assertEquals(expectedSum, integerUtils.sum(a, b));
    }

    @Test(timeout = 100)
    public void divide() {
        int s = 5 / 0;
        Assert.assertEquals(expectedDevide, integerUtils.divide(a, b));
    }

    @Test(timeout = 100)
    public void multiple() {
        Assert.assertEquals(expectedMultiple, integerUtils.multiple(a, b));
    }

    @Test(timeout = 100)
    public void testWithSeveralVerifications() {
        collector.checkThat(expectedDevide, equalTo(integerUtils.divide(b, a)));
        collector.checkThat(expectedDevide, equalTo(integerUtils.multiple(a, b)));
        collector.checkThat(expectedDevide, equalTo(integerUtils.sum(a, b)));
    }


}
