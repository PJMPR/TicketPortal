package com.packt.ticketportal.controller;

import com.packt.ticketportal.domain.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

/**
 * Created by Kuba on 2016-11-17.
 */
@Controller
public class ProductController {
    @RequestMapping("/tickets")
    public String list(Model model){
        Ticket systemOfADown = new Ticket("T1234","System of a Down", new BigDecimal(250));
        systemOfADown.setTicketDesc("Koncert System of A Down");
        systemOfADown.setTicketCat("Koncert");
        systemOfADown.setTicketsInStock(3000);
        model.addAttribute("ticket",systemOfADown);
        return "tickets";
    }
}
