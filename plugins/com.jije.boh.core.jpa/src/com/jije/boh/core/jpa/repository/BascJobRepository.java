package com.jije.boh.core.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.BascJob;

/**
 * Job CRUD repository
 * @author Paul.Yu
 */

@Transactional
public interface BascJobRepository extends CrudRepository<BascJob, String>, PagingAndSortingRepository<BascJob, String>, JpaSpecificationExecutor<BascJob>{
	
	@Transactional(readOnly = true)
	public List<BascJob> findBySerialnumber(String serialNumber);

}
