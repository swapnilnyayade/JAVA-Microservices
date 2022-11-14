package com.swap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swap.entity.Contact;
import com.swap.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getUserContacts(@PathVariable("userId") Long userId){
		
		return contactService.getContactsOfUser(userId);
		
	}
	
	@GetMapping("")
	public List<Contact> getContacts(){
		
		return contactService.getContacts();
		
	}

}
