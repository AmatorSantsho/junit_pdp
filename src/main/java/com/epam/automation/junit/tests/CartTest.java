package com.epam.automation.junit.tests;

import com.epam.automation.junit.matcher.IsSameCart;
import com.epam.automation.junit.model.Cart;
import com.epam.automation.junit.model.Transaction;
import com.epam.automation.junit.model.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;

public class CartTest extends BaseTest {

    private final User user = new User(1, "Alex");
    private final User user2 = new User(2, "Alex");
    private final List<Transaction> list = Arrays.asList(new Transaction("01", 01));
    private static List<Transaction> list2 = Arrays.asList(new Transaction("01", 02));
    private final Cart cart = new Cart(1, user, list);
    private final Cart cart2 = new Cart(2, user, list);
    private final Cart cart3 = new Cart(1, user2, list);
    private final Cart cart4 = new Cart(1, user, list2);

    @Test
    public void testCartWithSameUser() {
        assertThat(cart, IsSameCart.cartMatcher(cart));
    }

    @Test
    public void testCartWithDifferentCartId() {
        assertThat(cart, IsSameCart.cartMatcher(cart2));
    }

    @Test
    public void testCartWithDifferentUserId() {
        assertThat(cart, IsSameCart.cartMatcher(cart3));
    }

    @Test
    public void testCartWithDifferentTransactionAmount() {
        assertThat(cart, IsSameCart.cartMatcher(cart4));
    }

}
