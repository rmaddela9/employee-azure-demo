package com.mylearning.employeeazuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class EmployeeDemoController {

@GetMapping("/message")
public String message() {
	return "This is springboot and azure demo api";
}
	
	

}
