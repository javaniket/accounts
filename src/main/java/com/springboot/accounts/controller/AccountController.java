package com.springboot.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.accounts.model.Accounts;
import com.springboot.accounts.model.Customers;
import com.springboot.accounts.repository.AccountRepository;

//import in.bank.LoanApplication.model.Loans;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	//http://localhost:8080/loans/1
//	@GetMapping
	
	@PostMapping("/accounts")
	public List<Accounts> getAccountDetails(@RequestBody Customers customer)
	{
		List<Accounts> accounts = accountRepository.searchByCustomerId(customer.getCustomerId());
		return accounts;
	}
}
