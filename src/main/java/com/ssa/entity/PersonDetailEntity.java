package com.ssa.entity;





import java.sql.Date;

/**
 * Person entity record
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="SSA_PERSON_DETAILS")
public class PersonDetailEntity {
	@Id
	@SequenceGenerator(name="SSA_SEQ",sequenceName = "SSA_NUM_SEQ",initialValue=100000000,allocationSize=1)
	@GeneratedValue(generator="SSA_SEQ")
	@Column(name="SSA_NUMBER",length=9)
	private Long ssnNum;
	
	@Column(name="FIRST_NAME",length=20)
	private String fName;
	
	@Column(name="LAST_NAME",length=20)
	private String lName;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="GENDER",length=10)
	private String gender;
	
	@Column(name="STATE",length=20)
	private String state;

}
