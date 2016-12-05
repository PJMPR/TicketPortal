package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.Customer;
import com.packt.ticketportal.domain.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public class TicketMapper implements IMapResultSetIntoEntity<Ticket> {

    public Ticket map(ResultSet rs) throws SQLException{
        Ticket t = new Ticket();
        t.setId(rs.getInt("id"));
        t.setTicketName(rs.getString("name"));
        t.setPrice(rs.getBigDecimal("price"));
        t.setTicketsInStock(rs.getInt("inStock"));
        t.setTicketDesc(rs.getString("ticketDesc"));
        t.setLocation(rs.getString("location"));
        t.setTicketCat(rs.getString("category"));
        return t;
    }
}
