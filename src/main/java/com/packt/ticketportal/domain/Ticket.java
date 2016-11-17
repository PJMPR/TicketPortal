package com.packt.ticketportal.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created by Kuba on 2016-11-15.
 */

public class Ticket {
    private String ticketId;
    private String ticketName;
    private BigDecimal price;
    private String ticketDesc;
    private String ticketCat;
    private long ticketsInStock;
    private long ticketsInOrder;

    public Ticket(){
        super();
    }

    public Ticket(String ticketId, String ticketName, BigDecimal price){
        this.ticketId = ticketId;
        this.ticketName = ticketName;
        this.price = price;
    }

    //
    // GETTERY I SETTERY
    //

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTicketDesc() {
        return ticketDesc;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc;
    }

    public String getTicketCat() {
        return ticketCat;
    }

    public void setTicketCat(String ticketCat) {
        this.ticketCat = ticketCat;
    }

    public long getTicketsInStock() {
        return ticketsInStock;
    }

    public void setTicketsInStock(long ticketsInStock) {
        this.ticketsInStock = ticketsInStock;
    }

    public long getTicketsInOrder() {
        return ticketsInOrder;
    }

    public void setTicketsInOrder(long ticketsInOrder) {
        this.ticketsInOrder = ticketsInOrder;
    }


    //
    // Koniec GETTEROW I SETTEROW
    //


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ticket other = (Ticket) obj;
        if (ticketId == null)
        {
            if (other.ticketId != null)
                return false;
        }
        else if (!ticketId.equals(other.ticketId))
            return false;
        return true;
    }


    @Override
    public int hashCode(){
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((ticketId == null) ? 0 : ticketId.hashCode());
        return result;
    }


}
