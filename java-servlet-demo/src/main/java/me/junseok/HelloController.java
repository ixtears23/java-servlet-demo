package me.junseok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private HelloService helloService;
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, " + helloService.getName();
	}
}