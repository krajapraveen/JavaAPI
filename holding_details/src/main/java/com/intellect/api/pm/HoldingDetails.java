package com.intellect.api.pm;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.intellect.api.pojo.DashBoardTransactionInput;
import com.intellect.api.pojo.HoldingDatainput;
import com.intellect.api.pojo.InsuranceHoldingsInput;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value={"/holdings"})
@Api(value ="Holdings",description="Holding Details API")
public class HoldingDetails {
	
	
	@ApiOperation(value = "get Dashboard holdings")
	@RequestMapping(value="/getDashbordHolding",method= RequestMethod.POST,consumes="application/json",produces ="application/json")
	
	public ResponseEntity<String> getDashbordHolding(@RequestBody HoldingDatainput holdingDatainput) {
		
//		http://10.11.12.23:10421/ARXAL/AALIndex.jsp
		final String uri = "http://10.11.12.23:10421/PMSRest/rest/dashboard/getDashbordHolding";
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<HoldingDatainput> request = new HttpEntity<>(holdingDatainput, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(uri, request, String.class);
		
		System.out.println(">>>>>>>>>>>>>response from pms>>>>>>>>. " + responses.getBody());	
		return new ResponseEntity<String>(responses.getBody(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "get Dashboard Header")
	@RequestMapping(value="/getDashbordHeader",method= RequestMethod.POST,consumes="application/json",produces ="application/json")
	
	public ResponseEntity<String> getDashbordHeader(@RequestBody HoldingDatainput holdingDatainput) {
		
			
		final String uri = "http://10.10.16.200:10421/PMSRest/rest/dashboard/getDashbordHeader";
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<HoldingDatainput> request = new HttpEntity<>(holdingDatainput, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(uri, request, String.class);
		
		System.out.println(">>>>>>>>>>>>>response from pms>>>>>>>>. " + responses.getBody());	
		return new ResponseEntity<String>(responses.getBody(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "get Dashbord Transactions")
	@RequestMapping(value="/getDashbordTransactions",method= RequestMethod.POST,consumes="application/json",produces ="application/json")
	
	public ResponseEntity<String> getDashbordTransactions(@RequestBody DashBoardTransactionInput holdingDatainput) {
		
			
		final String uri = "http://10.10.16.200:10421/PMSRest/rest/dashboard/getDashbordTransactions";
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<DashBoardTransactionInput> request = new HttpEntity<>(holdingDatainput, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(uri, request, String.class);
		
		System.out.println(">>>>>>>>>>>>>response from pms>>>>>>>>. " + responses.getBody());	
		return new ResponseEntity<String>(responses.getBody(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "get Insurance Holdings")
	@RequestMapping(value="/getInsuranceHoldings",method= RequestMethod.POST,consumes="application/json",produces ="application/json")
	
	public ResponseEntity<String> getInsuranceHoldings(@RequestBody InsuranceHoldingsInput holdingDatainput) {
		
			
		final String uri = "http://10.10.16.200:10421/PMSRest/rest/dashboard/getInsuranceHoldings";
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<InsuranceHoldingsInput> request = new HttpEntity<>(holdingDatainput, headers);
		ResponseEntity<String> responses = restTemplate.postForEntity(uri, request, String.class);
		
		System.out.println(">>>>>>>>>>>>>response from pms>>>>>>>>. " + responses.getBody());	
		return new ResponseEntity<String>(responses.getBody(), HttpStatus.OK);
	}


}
