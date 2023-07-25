package com.itbulls.learnit.javacore.oop.exam.onlineshop.services;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.entities.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}