package com.itbulls.learnit.javacore.oop.exam.onlineshop.entities;

public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	void clear();

}