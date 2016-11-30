package com.packt.ticketportal.domain.mappers;

import com.packt.ticketportal.domain.HistoryLog;
import com.packt.ticketportal.domain.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kuba on 2016-11-29.
 */
public class HistoryLogMapper {
    public HistoryLog map(ResultSet rs) throws SQLException {
        HistoryLog t = new HistoryLog();
        t.setId(rs.getInt("id"));
        t.setAmount(rs.getInt("amount"));
        t.setDate(rs.getDate("date"));
        return t;
    }
}
