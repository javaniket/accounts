package com.springboot.accounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.accounts.model.Accounts;

//import in.bank.LoanApplication.model.Loans;
@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long>{
   
	@Query(value="SELECT * FROM accounts l WHERE l.customer_id=?1", nativeQuery = true)
	List<Accounts> searchByCustomerId(int customerId);

	
}
