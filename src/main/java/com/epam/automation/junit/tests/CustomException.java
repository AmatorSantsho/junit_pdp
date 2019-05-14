package com.epam.automation.junit.tests;

public class CustomException extends Throwable{
    public CustomException() {
        super(" Something went wrong...");
    }
}
