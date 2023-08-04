package ru.spring.SecurityPost.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.spring.SecurityPost.Dto.PersonRequestDto;
import ru.spring.SecurityPost.Dto.PersonResponseDto;
import ru.spring.SecurityPost.models.Person;
import ru.spring.SecurityPost.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	public PersonResponseDto addPerson(PersonRequestDto personDto) {
		Person person = personRepo.save(Person.builder()
				.login(personDto.getLogin())
				.password(personDto.getPassword())
				.role(personDto.getRole())
				.build());
		
		return PersonResponseDto.builder()
				.id(person.getId())
				.login(person.getLogin())
				.role(person.getRole())
				.build();
	}
}
