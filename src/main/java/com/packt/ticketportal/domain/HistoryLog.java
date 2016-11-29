package com.packt.ticketportal.domain;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;

import java.util.Date;

/**
 * Created by Kuba on 2016-11-29.
 */
public class HistoryLog implements IHaveId {
    private int id;
    private Customer customer;
    private Date date;
    private int amount;
    private Ticket forEvent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getForEvent() {
        return forEvent;
    }

    public void setForEvent(Ticket forEvent) {
        this.forEvent = forEvent;
    }
}


