package com.epam.automation.junit;

import com.epam.automation.junit.tests.IntegerUtilsTest;
import com.epam.automation.junit.tests.StringUtilsTest;
import org.junit.runner.JUnitCore;

public class Runner {
    public static void main (String[]args){
        JUnitCore.runClasses(IntegerUtilsTest.class, StringUtilsTest.class);
        }
    }

