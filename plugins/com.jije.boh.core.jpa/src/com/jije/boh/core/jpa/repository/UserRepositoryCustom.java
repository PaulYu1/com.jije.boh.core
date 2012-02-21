package com.jije.boh.core.jpa.repository;

import java.util.List;

import com.jije.boh.core.jpa.domain.User;

/**
 * Interface for repository functionality that ought to be implemented manually.
 * 
 * @author Murphy
 */
interface UserRepositoryCustom {

    /**
     * Custom repository operation.
     * 
     * @return
     */
    List<User> myCustomBatchOperation();
}
