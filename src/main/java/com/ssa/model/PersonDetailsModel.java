package com.ssa.model;


import java.sql.Date;

import lombok.Data;
/**
 * 
 * Person input data
 *
 */
@Data
public class PersonDetailsModel {
	
	private String fName;
	private String lName;
	private Date dob;
	private String gender;
	private String state;

}
