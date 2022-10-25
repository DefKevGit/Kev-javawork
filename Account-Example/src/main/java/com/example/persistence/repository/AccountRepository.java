package com.example.persistence.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Account;







@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>
{

	Optional<Account> findById(Long id);

	void deleteById(Long id);

	boolean existsById(Long id);
	

}
