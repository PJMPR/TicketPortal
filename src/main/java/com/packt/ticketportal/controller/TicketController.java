package com.packt.ticketportal.controller;

import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.impl.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

/**
 * Created by Kuba on 2016-11-17.
 */

@Controller
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @RequestMapping("/tickets")
    public String list(Model model){

        model.addAttribute("tickets",ticketRepository.getAllTickets());
        return "tickets";
    }
}
