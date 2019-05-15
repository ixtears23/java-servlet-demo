package me.junseok;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	private HelloService helloService;
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello, " + helloService.getName();
	}
	
	@GetMapping("/sample")
	public void sample() {
=======
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
>>>>>>> branch 'master' of https://github.com/ixtears23/java-servlet-demo.git
	}
}
