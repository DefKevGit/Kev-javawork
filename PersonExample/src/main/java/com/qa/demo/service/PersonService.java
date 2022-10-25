package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.domain.PersonDTO;
import com.qa.demo.persistence.repo.PersonRepo;

@Service
public class PersonService
{

	private PersonRepo personRepo;

	private ModelMapper mapper;

	public PersonService(PersonRepo repo, ModelMapper mapper)
	{
		super();
		this.personRepo = repo;
		this.mapper = mapper;

	}

	private PersonDTO mapToDTO(Person person)
	{
		return this.mapper.map(person, PersonDTO.class);
	}

	public PersonDTO addPerson(Person person)
	{
		Person saved = this.personRepo.save(person);
		return this.mapToDTO(saved);
	}

	public List<PersonDTO> getAllPeople()
	{
		return this.personRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public PersonDTO updatePerson(Long id, Person newPerson)
	{
		Optional<Person> existingOptional = this.personRepo.findById(id);
		Person existing = existingOptional.get();

		existing.setAge(newPerson.getAge());
		existing.setName(newPerson.getName());

		Person updated = this.personRepo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean removePerson(Long id)
	{
		this.personRepo.deleteById(id);
		boolean exists = this.personRepo.existsById(id);
		return !exists;
	}

	public List<Person> findByName(String name)
	{
		return this.personRepo.findPersonByName(name);
	}

	public Person findOneByNameAge(String name, int age)
	{
		return this.personRepo.findOnePersonByNameAndAge(name, age);
	}

	public List<Person> findAllByNameAge(String name, int age)
	{
		return this.personRepo.findPeopleByNameAndAge(name, age);
	}

	public List<Person> findByAgeAbove(int age)
	{
		return this.personRepo.findPersonByAgeGreaterThan(age);
	}

	public List<Person> findByAgeBelow(int age)
	{
		return this.personRepo.findPersonByAgeLessThan(age);
	}

	public List<Person> findByNoName()
	{
		return this.personRepo.findPersonByNameIsNull();
	}

	public List<Person> findByHasName()
	{
		return this.personRepo.findPersonByNameIsNotNull();
	}
}
