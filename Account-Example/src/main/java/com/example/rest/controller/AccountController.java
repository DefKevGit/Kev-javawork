package com.example.rest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.persistence.domain.Account;
import com.example.rest.dto.AccountDTO;
import com.example.service.AccountService;

@RestController
public class AccountController
{
	@Autowired
	AccountService service;
	
	@PostMapping("/create")
	public ResponseEntity<AccountDTO> create(@RequestBody Account acc) 
	{
		return new ResponseEntity<>(this.service.create(acc),HttpStatus.CREATED);
	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List<AccountDTO>> read() 
	{
		return ResponseEntity.ok(this.service.readAll());
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<AccountDTO> update(@PathVariable Long id, @RequestBody Account acc)
	{
	 return new ResponseEntity<>(this.service.update(id, acc),HttpStatus.ACCEPTED);	
	}
	
	@Transactional
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id)
	{
		return ResponseEntity.ok(this.service.delete(id));
	}
}
