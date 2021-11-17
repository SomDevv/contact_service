package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> list = List.of(
      new Contact(1L, "rama@gmail.com", "Rama", 1311L) ,
      new Contact(2L, "sommay@gmail.com","Sommay", 1312L),
      new Contact(3L, "arindam@gmail.com", "Arindam", 1313L),
      new Contact(4L, "geetha@gmail.com","Geetha",1314L),
      new Contact(5L, "khavin@gmail.com", "Khavin", 1315L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
