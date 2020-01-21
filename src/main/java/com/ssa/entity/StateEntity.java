package com.ssa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * 
 * @author Ashish
 * Satate entity property
 */
@Data
@Entity
@Table(name="STATE_ENTITY_MASTER")
public class StateEntity {	
    
	@Id
	@Column(name="SID",length=10)
	private int stateId;
	
	@Column(name="SCD",length=20)
	private String stateCode;
	
	@Column(name="SNAME",length=25)
	private String stateName;

}
