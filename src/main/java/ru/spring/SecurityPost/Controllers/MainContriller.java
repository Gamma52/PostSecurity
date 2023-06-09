package ru.spring.SecurityPost.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.spring.SecurityPost.Dto.PersonRequestDto;
import ru.spring.SecurityPost.Dto.PersonResponseDto;
import ru.spring.SecurityPost.service.PersonService;

@RestController
public class MainContriller {
	
	@Autowired
	private PersonService personService;
	
	// Registration
	@GetMapping("/reg")
	public PersonResponseDto registration(@RequestBody PersonRequestDto personDto) {
		return personService.addPerson(personDto);
	}
	
	// Public 
	@GetMapping("/")
	public String showPublicInfo() {
		return "Hello visitor!";
	}
	
		
	// Only for users
	@GetMapping("/user")
	public String showPrivateInfo() {
		return "Hello User!";
	}
	
	
	// Only for Admin
	@GetMapping("/admin")
	public String showSecretInfo() {
		return "Hello Admin!";
	}

}
