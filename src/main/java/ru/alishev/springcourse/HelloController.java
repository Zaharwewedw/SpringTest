package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello_world")
	public String sayHelloWord() {
		return "hello_world";
	}
}
