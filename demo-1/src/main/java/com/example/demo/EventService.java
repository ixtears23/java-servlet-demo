package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventService {

	public List<Event> getEvents() {
		
		Event event1 = Event.builder()
			.name("스프링 웹 MVC 스터디")
			.limitOfEnrollment(5)
			.startDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
			.endDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
			.build();
		
		Event event2 = Event.builder()
				.name("스프링 웹 MVC 스터디")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0))
				.endDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
				.build();
		
		return Arrays.asList(event1, event2);
	}
}
