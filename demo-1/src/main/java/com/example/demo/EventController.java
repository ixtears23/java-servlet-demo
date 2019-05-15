package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
	
	EventService eventService;

	private EventController(EventService eventService) {
		this.eventService = eventService;
	}

	@GetMapping("/events")
	public String events(Model model) {
		model.addAttribute("events", eventService.getEvents());
		return "events/list";
	}
}
