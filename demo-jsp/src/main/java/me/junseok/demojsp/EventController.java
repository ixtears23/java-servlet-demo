package me.junseok.demojsp;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

	@GetMapping("/events")
	public String getEvents(Model model) {
		
		Events event1 = new Events();
		event1.setName("스프링 웹 MVC 스터디 1");
		event1.setStarts(LocalDateTime.of(2019, 1, 15, 10, 10));
		Events event2 = new Events();
		event2.setName("스프링 웹 MVC 스터디 2");
		event2.setStarts(LocalDateTime.of(2019, 1, 22, 10, 10));
		
		List<Events> events = Arrays.asList(event1, event2);
 		
		model.addAttribute("events", events);
		model.addAttribute("message", "Happy New Year!");
		
		return "events/list";
	}
}
