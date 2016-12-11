package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Kuba on 2016-11-29.
 */
public class CustomerMapper implements IMapResultSetIntoEntity<Customer> {
    public Customer map(ResultSet rs) throws SQLException {
        Customer t = new Customer();
        t.setId(rs.getInt("id"));
        t.setAddress(rs.getString("address"));
        t.setNoOfOrdersMade(rs.getInt("noOfOrders"));
        t.setName(rs.getString("name"));
        t.setRegistrationDate(new Date());
        return t;
    }
}
