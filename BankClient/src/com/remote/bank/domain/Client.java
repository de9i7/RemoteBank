package com.remote.bank.domain;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public class Client {

    private Set<Account> accounts = new LinkedHashSet<Account>();

    /** Clients name */
    private String name;

    /** Client's gender*/
    private boolean gender;

    /**
     * Empty constructor
     */
    public Client() {
    }

    public Client(String name, boolean gender, Account account) {
        this.name = name;
        this.accounts.add(account);
        this.gender = gender;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
