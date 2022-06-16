package com.water.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.water.app.model.Account;
import com.water.app.model.Response;

@RestController
public class TradeController {
	
	@GetMapping(value = "/get_all_accounts")
	public Response<List<Account>> getAllAccounts(){
		List<Account> allAccounts = new ArrayList<Account>();
		return Response.getSuccess(allAccounts);
	}

}
