package com.jije.boh.core.jpa.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.BascStore;

/**
 * Store CRUD repository
 * @author Paul.Yu
 */

@Transactional
public interface BascStoreRepository extends CrudRepository<BascStore, String>, PagingAndSortingRepository<BascStore, String>, JpaSpecificationExecutor<BascStore>{
	
	@Transactional(readOnly = true)
	public BascStore findByCompany(String company);
}
