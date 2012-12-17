package com.remote.bank.domain;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public class Bank {

    private Set<Client> clients = new TreeSet<Client>();

    public Bank() {

    }

    public Bank(Set<Client> clients) {
        this.clients = clients;
        //
    }

    public Set<Client> getClients() {
        return clients;
    }
}
