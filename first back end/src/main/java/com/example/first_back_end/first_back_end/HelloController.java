package com.example.first_back_end.first_back_end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hi")
	public String sayHi() {
		return "hello world";
	}
}


