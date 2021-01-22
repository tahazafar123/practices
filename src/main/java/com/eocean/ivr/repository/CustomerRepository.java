package com.eocean.ivr.repository;

import com.eocean.ivr.persistance.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer , Long> {
}
