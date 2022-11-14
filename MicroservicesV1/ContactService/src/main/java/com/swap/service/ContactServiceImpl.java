package com.swap.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.swap.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contactLst = List.of(
			new Contact(1L, "amit@gmail.com", "Amit", 1311L),
			new Contact(1L, "rohan@gmail.com", "Rohan", 1311L),
			new Contact(1L, "tejas@gmail.com", "tejas", 1312L),
			new Contact(1L, "nayan@gmail.com", "Nayan", 1314L)
			);
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return contactLst.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return contactLst;
	}

}
