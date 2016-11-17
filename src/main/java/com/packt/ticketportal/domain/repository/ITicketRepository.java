package com.packt.ticketportal.domain.repository;

import com.packt.ticketportal.domain.Ticket;

import java.util.List;

/**
 * Created by Kuba on 2016-11-17.
 */
public interface ITicketRepository {
    List<Ticket> getAllTickets();
}
