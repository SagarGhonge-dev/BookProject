package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/show")
	public List<String> homepage(@RequestParam int a, @RequestParam int b, @RequestParam int limit,
			@RequestParam String c, @RequestParam String d) {

		List<String> l = new LinkedList<>();
		for (Integer i = 1; i <= limit; i++) {

			if (i % a == 0 && i % b == 0) {
				l.add(c + d);
			}
			else if (i % a == 0) {
				l.add(c);
			} else if (i % b == 0) {
				l.add(d);
			} else {
				l.add(i.toString());
			}

		}

		return l;
	}

}
