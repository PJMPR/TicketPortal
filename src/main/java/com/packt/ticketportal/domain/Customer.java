package com.packt.ticketportal.domain;

/**
 * Created by Kuba on 2016-11-15.
 */
public class Customer {
    private String customerId;
    private String name;
    private String address;
    private long noOfOrdersMade;

    //
    // GETTERY I SETTERY
    //

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(long noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    //
    // KONIEC GETTEROW I SETTEROW
    //

    @Override
    public int hashCode(){
        final int prime = 15;
        int result = 1;
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }
}
