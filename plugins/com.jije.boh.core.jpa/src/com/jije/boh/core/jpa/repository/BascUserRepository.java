package com.jije.boh.core.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.BascUser;

/**
 * Use CRUD repository
 * @author Paul.Yu
 */


@Transactional
public interface BascUserRepository extends CrudRepository<BascUser, String>, PagingAndSortingRepository<BascUser, String>, JpaSpecificationExecutor<BascUser>{
	
	@Transactional(readOnly = true)
	public List<BascUser> findByEmployeeid(String employeeId);
}
