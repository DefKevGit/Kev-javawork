package com.qa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.domain.PersonDTO;
import com.qa.demo.service.PersonService;

@RestController
public class PersonController
{

	@Autowired
	public PersonService service;

	public PersonController(PersonService service)
	{
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public PersonDTO addPerson(@RequestBody Person person)
	{
		return this.service.addPerson(person);
	}

	@GetMapping("/getAll")
	public List<PersonDTO> getAllPeople()
	{
		return this.service.getAllPeople();
	}

	@PutMapping("/update/{id}")
	public PersonDTO updatePerson(@PathVariable("id") Long id, @RequestBody Person person)
	{
		return this.service.updatePerson(id, person);
	}

	@DeleteMapping("/delete/{id}")
	public boolean removePerson(@PathVariable Long id)
	{
		return this.service.removePerson(id);
	}

	@GetMapping("/test")
	public String test()
	{
		return "Hello, World!";
	}

	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<Person>> findByName(@PathVariable String name)
	{
		return ResponseEntity.ok(this.service.findByName(name));
	}

	@GetMapping("/findOneByNameAge/{name}/{age}")
	public ResponseEntity<Person> findOneByNameAge(@PathVariable String name, @PathVariable int age)
	{
		return ResponseEntity.ok(this.service.findOneByNameAge(name, age));
	}

	@GetMapping("/findAllByNameAge/{name}/{age}")
	public ResponseEntity<List<Person>> findAllByNameAge(@PathVariable String name, @PathVariable int age)
	{
		return ResponseEntity.ok(this.service.findAllByNameAge(name, age));
	}

	@GetMapping("/findByAgeAbove/{age}")
	public ResponseEntity<List<Person>> findByAgeAbove(@PathVariable int age)
	{
		return ResponseEntity.ok(this.service.findByAgeAbove(age));
	}

	@GetMapping("/findByAgeBelow/{age}")
	public ResponseEntity<List<Person>> findByAgeBelow(@PathVariable int age)
	{
		return ResponseEntity.ok(this.service.findByAgeBelow(age));
	}

	@GetMapping("/findByNoName")
	public ResponseEntity<List<Person>> findByNoName()
	{
		return ResponseEntity.ok(this.service.findByNoName());
	}

	@GetMapping("/findByHasName")
	public ResponseEntity<List<Person>> findByHasName()
	{
		return ResponseEntity.ok(this.service.findByHasName());
	}

}