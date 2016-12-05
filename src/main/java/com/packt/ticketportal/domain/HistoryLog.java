package com.packt.ticketportal.domain;

import java.util.Date;

/**
 * Created by Kuba on 2016-11-29.
 */
public class HistoryLog implements IHaveId {
    private int id;
    private int customerId;
    private Date date;
    private int amount;
    private int ticketForEventId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public int getTicketForEventId() {
        return ticketForEventId;
    }

    public void setTicketForEventId(int ticketForEventId) {
        this.ticketForEventId = ticketForEventId;
    }
}


