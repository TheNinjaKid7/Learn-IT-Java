package com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.impl;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Cart;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Product;

public class DefaultCart implements Cart {

	// <write your code here>
	
	@Override
	public boolean isEmpty() {
		// <write your code here>
		
		return true;
	}

	@Override
	public void addProduct(Product product) {
		// <write your code here>
	}

	@Override
	public Product[] getProducts() {
		// <write your code here>
		
		return null;
	}

	@Override
	public void clear() {
		// <write your code here>
	}

}