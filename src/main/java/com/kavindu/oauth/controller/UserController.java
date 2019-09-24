package com.kavindu.oauth.controller;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

	@GetMapping("/user")
	public ResponseEntity<Principal> getUser(Principal user){
		
		return new ResponseEntity<Principal>(user,HttpStatus.OK);
	} 
}
