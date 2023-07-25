package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}