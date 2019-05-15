package com.epam.automation.junit.matcher;

import com.epam.automation.junit.model.Cart;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.*;


public class IsSameCart {
    public static Matcher<Cart> cartMatcher(Cart expected) {
        return allOf(
                hasProperty("id", equalTo(expected.getId())),
                hasProperty("user", allOf(
                        hasProperty("id", equalTo(expected.getUser().getId())),
                        hasProperty("name", equalTo(expected.getUser().getName())))
                ),
                hasProperty("transactions", hasItem(
                        allOf(
                                hasProperty("date", equalTo(expected.getTransactions().get(0).getDate())),
                                hasProperty("amount", equalTo(expected.getTransactions().get(0).getAmount()))

                        ))));
    }
}
