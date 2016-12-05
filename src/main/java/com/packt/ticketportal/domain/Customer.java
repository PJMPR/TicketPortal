package com.packt.ticketportal.domain;

import java.util.Date;

/**
 * Created by Kuba on 2016-11-15.
 */

public class Customer implements IHaveId {
    private int id;
    private String name;
    private String address;
    private int noOfOrdersMade;
    private Date registrationDate;


    public Customer(){
        super();
    }
    public Customer( String name, String address){
        this.name = name;
        this.address = address;
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

    public int getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(int noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }


    //
    // KONIEC GETTEROW I SETTEROW
    //
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
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
        final int PRIME = 15;
        int result = 1;
        result = PRIME * result + ((id == 0) ? 0 : hashCode());
        return result;
    }
}
