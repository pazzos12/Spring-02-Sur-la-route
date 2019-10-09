package com.newspringProject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.newspringdoctor.SpringDoctor;

@Controller
@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);
	}
	
	
	@RequestMapping("/doctor/{number}")
	@ResponseBody
	public SpringDoctor springDoctor(@PathVariable int number, @RequestParam(required=false) String title){
	
	if(number >=1 && number <=8){
		
		throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Don't disturb");
	}
		
			switch (number)
			{
		
				case 9:
					SpringDoctor doctor9 = new SpringDoctor("Christopher Eccleston", 9);
					return (doctor9);
				case 10:
					SpringDoctor doctor10 = new SpringDoctor("David Tennant", 10);
					return (doctor10);
		
				case 11:
					SpringDoctor doctor11 = new SpringDoctor("Matt Smith", 11);
					return (doctor11);
		
				case 12:
					SpringDoctor doctor12 = new SpringDoctor("Peter Capaldi", 12);
					return (doctor12);
		
				case 13:
					SpringDoctor doctor13 = new SpringDoctor("Jodie Whittaker", 13);
					return (doctor13);
			}
			
		
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No way to get the incarnation : "+number);
					
	
	}
}
