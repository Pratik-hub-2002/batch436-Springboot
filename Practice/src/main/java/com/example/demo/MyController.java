package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TKA")
public class MyController {

	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String firstAPI() {

		return "JAVA";
	}

	@PutMapping("/python")
	public String secondApi() {

		return "Python";
	}

	@PostMapping("/.net")
	public String thirdApi() {

		return ".net";
	}

	@DeleteMapping("/c++")
	public String fourthApi() {

		return "c++";
	}

	@GetMapping("/English")
	public String fifthApi() {

		return "English";
	}

	@PatchMapping("/python")
	public String sixthApi() {

		return "Python";
	}

}
