package com.ssa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.service.SsaRegistrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("This rest Controller will take ssn number and return stateCode")
public class SsaRegistrationRestController {
	
	@Autowired
	private SsaRegistrationService ssaService;

	@GetMapping(value = "/getStateCode/{ssNo}", 
			produces = { "application/json" })
	
	@ApiOperation("This method will retun stateCode")
	@ApiResponses({
		@ApiResponse(code=200,message="Success"),
		@ApiResponse(code=400,message="Bad Request"),
		@ApiResponse(code=500,message="Server Problem")
	})
	public ResponseEntity<String> fetchStateCode(@ApiParam("ssn Number")@PathVariable("ssNo") Long ssnNum) {
		 String stateCode = ssaService.getStateCode(ssnNum);
		return  new ResponseEntity<String>(stateCode, HttpStatus.OK);
	}

}
