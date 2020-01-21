
package com.ssa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ssa.entity.PersonDetailEntity;
/**
 * 
 * Repository interface taken to get pre-defined method
 * to perform required operation
 * 
 */
@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetailEntity, Integer> {
    
	@Query(value = "SELECT state FROM PersonDetailEntity WHERE ssnNum=:ssaNum")
	public String findStateCode(Long ssaNum);
}
