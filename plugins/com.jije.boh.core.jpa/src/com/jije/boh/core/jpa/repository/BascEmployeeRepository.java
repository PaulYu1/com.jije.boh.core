package com.jije.boh.core.jpa.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.BascEmployee;

/**
 * Employee CRUD repository
 * @author Paul.Yu
 */

@Transactional
public interface BascEmployeeRepository extends CrudRepository<BascEmployee, String>, PagingAndSortingRepository<BascEmployee, String>, JpaSpecificationExecutor<BascEmployee>{
	
	@Transactional(readOnly = true)
	public BascEmployee findById(String id);
}
