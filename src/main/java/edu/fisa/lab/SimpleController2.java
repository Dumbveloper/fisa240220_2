package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController2 {

	@GetMapping("getdata")
	public String get() {
		return "fisa data - 수정";
	}
}
