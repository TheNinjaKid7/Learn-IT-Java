package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}