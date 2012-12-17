package com.remote.bank.domain;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public interface Account {

    public String getAccountName();
    public int getBalance();
    public int getOverdraft();

}
