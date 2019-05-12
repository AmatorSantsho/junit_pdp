package com.epam.automation.junit.project;

public class StringUtils {
    public String addHelloToStart(String s) {
        return "Hello " + s;
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String concat(String a, String b) {
        return a + " " + b;
    }
}
