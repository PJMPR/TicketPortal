package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.HistoryLog;
import com.packt.ticketportal.domain.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public class HistoryLogMapper implements IMapResultSetIntoEntity<HistoryLog> {
    public HistoryLog map(ResultSet rs) throws SQLException {
        HistoryLog t = new HistoryLog();
        t.setId(rs.getInt("id"));
        t.setAmount(rs.getInt("amount"));
        t.setCustomerId(rs.getInt("customer"));
        t.setTicketForEventId(rs.getInt("event"));
        t.setDate(rs.getDate("dateOfTransaction"));
        return t;
    }
}
