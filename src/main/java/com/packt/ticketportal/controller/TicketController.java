package com.packt.ticketportal.controller;

import com.packt.ticketportal.domain.Ticket;
import com.packt.ticketportal.domain.repository.IRepositoryCatalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Kuba on 2016-11-17.
 */
///////////////////// NIE DZIALA --- Dodac beany i DI
@Controller
public class TicketController {
    private IRepositoryCatalogue iRepository;

    @RequestMapping("/tickets")
    public String list(Model model){

        model.addAttribute("tickets",iRepository.ticket().getAll());
        return "tickets";
    }
}
