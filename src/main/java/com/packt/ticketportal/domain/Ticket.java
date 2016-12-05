package com.packt.ticketportal.domain;

import java.math.BigDecimal;

/**
 * Created by Kuba on 2016-11-15.
 */

public class Ticket implements IHaveId {
    private int id;
    private String ticketName;
    private BigDecimal price;
    private String ticketDesc;
    private String ticketCat;
    private long ticketsInStock;
    private String location;
    private int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Ticket(){
        super();
    }

    public Ticket( String ticketName, String location, BigDecimal price){
        this.ticketName = ticketName;
        this.location = location;
        this.price = price;
    }

    //
    // GETTERY I SETTERY
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        if (id == 0)
        {
            if (other.id != 0)
                return false;
        }
        else if (id!=(other.id))
            return false;
        return true;
    }


    @Override
    public int hashCode(){
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((id == 0) ? 0 : hashCode());
        return result;
    }


}
