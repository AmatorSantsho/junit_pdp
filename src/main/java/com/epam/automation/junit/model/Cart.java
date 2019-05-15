package com.epam.automation.junit.model;

import java.util.List;

public class Cart {
    private int id;
    private User user;
    private List<Transaction> transactions;

    public Cart(int id, User user, List<Transaction> transactions) {
        this.id = id;
        this.user = user;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
