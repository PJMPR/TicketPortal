package com.packt.ticketportal.domain.repository.impl;

import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.ITicketRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 2016-11-17.
 */
@Repository
public class TicketRepository implements ITicketRepository {

    private List<Ticket> listOfTickets = new ArrayList<Ticket>();

    public List<Ticket> getAllTickets() {
        return listOfTickets;
    }

}
