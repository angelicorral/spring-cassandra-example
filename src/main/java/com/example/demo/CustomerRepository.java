package com.example.demo;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
 
public interface CustomerRepository extends CrudRepository<Customer, String> {
	
	@Query(value="SELECT * FROM customer WHERE firstname=?0")
	public List<Customer> findByFirstname(String firstname);
 
	@Query("SELECT * FROM customer WHERE age > ?0")
	public List<Customer> findCustomerHasAgeGreaterThan(int age);
}	