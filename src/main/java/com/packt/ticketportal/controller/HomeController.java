package com.packt.ticketportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/welcome")
	public String welcome(Model model){
		model.addAttribute("greeting","TicketPortal!");
		model.addAttribute("tagline", "Portal z biletami na nadchodzące wydarzenia");
		return "welcome";
	}
}
