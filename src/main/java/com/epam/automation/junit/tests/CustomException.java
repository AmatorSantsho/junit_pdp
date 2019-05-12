package com.epam.automation.junit.tests;

public class CustomException extends RuntimeException {
    public CustomException() {
        super("Something went wrong...");
    }
}
