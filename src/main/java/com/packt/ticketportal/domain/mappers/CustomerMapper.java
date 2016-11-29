package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public class CustomerMapper {
    public Customer map(ResultSet rs) throws SQLException {
        Customer t = new Customer();
        t.setId(rs.getInt("id"));
        t.setAddress(rs.getString("address"));
        t.setNoOfOrdersMade(rs.getInt("noOfOrders"));
        t.setRegistrationDate(rs.getDate("registrationDate"));
        t.setName(rs.getString("name"));
        t.setTickets(rs.getArray("tickets"));
        return t;
    }
}
