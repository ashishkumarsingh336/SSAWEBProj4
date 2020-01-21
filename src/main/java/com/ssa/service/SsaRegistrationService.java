package com.ssa.service;

import java.util.List;

import com.ssa.model.PersonDetailsModel;

public interface SsaRegistrationService {
    
	public List<String> getAllState();
	
	public String savePersonDetails(PersonDetailsModel personModel);
	
	public String getStateCode(Long ssnNum);
}
