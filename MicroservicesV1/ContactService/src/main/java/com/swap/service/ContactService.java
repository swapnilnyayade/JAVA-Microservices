package com.swap.service;

import java.util.List;

import com.swap.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
	
	public List<Contact> getContacts();
}
