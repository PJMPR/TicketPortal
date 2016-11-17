package com.packt.ticketportal.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Kuba on 2016-11-15.
 */
@Entity
public class Customer {
    private Long customerId;
    private String name;
    private String address;
    private long noOfOrdersMade;
    private Date registrationDate = new Date();
    private List<Ticket> tickets = new ArrayList<Ticket>();


    public Customer(){
        super();
    }
    public Customer(Long customerId, String name, String address){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    //
    // GETTERY I SETTERY
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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

    @Temporal(TemporalType.DATE)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
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
