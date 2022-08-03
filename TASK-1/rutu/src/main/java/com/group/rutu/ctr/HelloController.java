package com.group.rutu.ctr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/rutu")
	public String index() {
		return "I am Rutuparn";
	}

}