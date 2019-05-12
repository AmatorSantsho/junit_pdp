package com.epam.automation.junit.tests;

import com.epam.automation.junit.project.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest extends BaseTest {
    private StringUtils stringUtils;
    private final String hello = "Hello";
    private final String world = "World";
    private final String expected_Hello = "Hello World";
    private final String expected_Reverse = "dlroW";

    @Before()
    public void setUp() throws Exception {
        System.out.println("Before method " + testName.getMethodName());
        stringUtils = new StringUtils();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After method " + testName.getMethodName());
        stringUtils = null;
    }

    @Test
    public void addHelloToStart() {
        Assert.assertEquals(expected_Hello, stringUtils.addHelloToStart(world));
    }

    @Test
    public void reverse() {
        Assert.assertEquals(expected_Reverse, stringUtils.reverse(world));
    }

    @Test
    public void concat() {
        Assert.assertEquals(expected_Hello, stringUtils.concat(hello, world));
    }
}