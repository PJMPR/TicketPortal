package com.packt.ticketportal.domain;

/**
 * Created by Kuba on 2016-11-15.
 */
public class Customer {
    private String customerId;
    private String name;
    private String address;
    private long noOfOrdersMade;

    public Customer(){
        super();
    }
    public Customer(String customerId, String name, String address){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

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
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (customerId == null)
        {
            if (other.customerId != null)
                return false;
        }
        else if (!customerId.equals(other.customerId))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        final int PRIME = 15;
        int result = 1;
        result = PRIME * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }
}
