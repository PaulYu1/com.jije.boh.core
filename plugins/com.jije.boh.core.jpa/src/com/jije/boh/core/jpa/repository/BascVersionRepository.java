package com.jije.boh.core.jpa.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.BascVersion;

/**
 * Version CRUD repository
 * @author Paul.Yu
 */

@Transactional
public interface BascVersionRepository extends CrudRepository<BascVersion, String>, PagingAndSortingRepository<BascVersion, String>, JpaSpecificationExecutor<BascVersion>{

}
