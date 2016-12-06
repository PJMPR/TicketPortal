package com.packt.ticketportal.domain.repository;

import com.packt.ticketportal.domain.Ticket;

import java.util.List;

/**
 * Created by Kuba on 2016-12-05.
 */
public interface ITicketRepository extends IRepository<Ticket> {
    List<Ticket> byCategory(String category);
}
