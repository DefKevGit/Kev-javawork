package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.example.exception.AccountNotFoundException;
import com.example.persistence.domain.Account;
import com.example.persistence.repository.AccountRepository;
import com.example.rest.dto.AccountDTO;

@Service
public class AccountService
{
	AccountRepository accRepo;
	
	private ModelMapper mapper;

	public AccountService(AccountRepository accRepo, ModelMapper mapper)
	{
		super();
		this.accRepo = accRepo;
		this.mapper=mapper;
	}
	
	private AccountDTO mapToDTO(Account acc)
	{
		return this.mapper.map(acc, AccountDTO.class);
	}
	
	public AccountDTO create(Account acc) 
	{
		Account saved = this.accRepo.save(acc);
		return this.mapToDTO(saved);
	}
	
	public List<AccountDTO> readAll()
	{
		return this.accRepo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public AccountDTO update(Long id, Account newAccount  ) throws AccountNotFoundException
	{
		Optional<Account> existingOptional = Optional.of(this.accRepo.findById(id).orElseThrow(()-> new AccountNotFoundException()));
		Account existing = existingOptional.get();
		existing.setAccNum(newAccount.getAccNum());
		existing.setName(newAccount.getName());

		Account updated = this.accRepo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean delete (Long id)
	{
		this.accRepo.deleteById(id);
		boolean exists = this.accRepo.existsById(id);
		return !exists;
	}

	

}