package com.itbulls.learnit.javacore.oop.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {

	// Constants
	private static final int DEFAULT_CART_CAPACITY = 10;
	private static final int MONEY_SCALE = 2;
	private static final double DEFAULT_TAX_RATE = 0.15;
	private static final String DEFAULT_TAX_TYPE = "incomeTax";
	private static final double DEFAULT_DISCOUNT_RATE = 0;
	private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

	// Static variable
	private static int cartCounter;

	// Instance variables
	private int id;
	private int userId;
	private BigDecimal totalNetPrice; // without taxes
	private BigDecimal totalGrossPrice; // with taxes
	private BigDecimal totalTax;
	private Tax tax;
	private Product[] products;
	private int indexToAddNewProduct;
	private Discount discount;

	// Static block
	static {
		System.out.println("Cart.class is uploaded into JVM");
	}

	// Instance initialization block
	{
		cartCounter++;
		userId = 1;
		tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
		discount = new Discount(DEFAULT_DISCOUNT_NAME, DEFAULT_DISCOUNT_RATE);
	}

	// Constructors

	public Cart() {
	}

	public Cart(int id, int userId) {
		this.id = id;
		this.userId = userId;
	}

	// Methods

	public void addProduct(Product product) {
		// Check if the product is null
		if (product == null) {
			return;
		}

		// Initialize the products array if it is null
		if (products == null) {
			products = new Product[DEFAULT_CART_CAPACITY];
		}

		// Resize the products array if necessary
		if (products.length < indexToAddNewProduct + 1) {
			products = Arrays.copyOf(products, products.length << 1);
		}
		
//		Arrays.copyOf(products, products.length << 1)
//		creates a new array with a larger size by doubling the length of the 
//		existing products array. The ""products.length << 1"" expression shifts 
//		the length of the products array left by 1 bit, effectively multiplying it by 2.

		
		// Add the product to the products array and update the counters
		products[indexToAddNewProduct++] = product;
		calculateTotalNetPrice();
		calculateTotalGrossPrice();
	}

	private BigDecimal calculateTotalNetPrice() {
		// Calculate the total net price of all products
		this.totalNetPrice = BigDecimal
				.valueOf(Arrays.stream(this.products)
						.mapToDouble(product -> product != null ? product.getPrice().doubleValue() : 0).sum())
				.setScale(MONEY_SCALE, RoundingMode.HALF_UP);
		return this.totalNetPrice;
	}

	private BigDecimal calculateTotalGrossPrice() {
		// Calculate the total gross price (with taxes and discounts)

		// Check if the total net price is negative
		if (this.totalNetPrice.doubleValue() < 0) {
			calculateTotalNetPrice();
		}

		// Calculate the discount amount based on the total net price
		BigDecimal orderDiscount = this.totalNetPrice.multiply(BigDecimal.valueOf(discount.getDiscountRate()))
				.setScale(MONEY_SCALE, RoundingMode.HALF_UP);

		// Calculate the total tax amount based on the total net price
		this.totalTax = this.totalNetPrice.multiply(BigDecimal.valueOf(tax.getTaxRate())).setScale(MONEY_SCALE,
				RoundingMode.HALF_UP);

		// Calculate the total gross price by adding taxes and subtracting discounts
		this.totalGrossPrice = this.totalNetPrice.add(this.totalTax).subtract(orderDiscount);

		return this.totalGrossPrice;
	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// Check if the provided id is negative
		if (id < 0) {
			return; 	// The return statement here is used solely for control flow, 
		 }				// rather than returning a value to the caller.
		
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Product[] getProducts() {
		// Create a copy of the products array to prevent direct modification
		return Arrays.copyOf(products, products.length);
	}

	public int getIndexOfLastProductAdded() {
		return indexToAddNewProduct;
	}

	public static int getCartCounter() {
		return cartCounter;
	}

	public BigDecimal getTotalNetPrice() {
		return totalNetPrice;
	}

	public BigDecimal getTotalGrossPrice() {
		return totalGrossPrice;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", userId=" + userId + ", totalNetPrice=" + totalNetPrice + ", totalGrossPrice="
				+ totalGrossPrice + ", totalTax=" + totalTax + ", products=" + Arrays.toString(products)
				+ ", indexOfLastProductAdded=" + indexToAddNewProduct + "]";
	}

	// Inner class: Discount

	public class Discount {
		private String discountName;
		private double discountRate;

		public Discount(String discountName, double discountRate) {
			this.discountName = discountName;
			this.discountRate = discountRate;
		}

		public String getDiscountName() {
			return discountName;
		}

		public void setDiscountName(String discountName) {
			this.discountName = discountName;
		}

		public double getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
	}

	// Static inner class: Tax

	public static class Tax {
		private String taxType;
		private double taxRate;

		public Tax(String taxType, double taxRate) {
			this.taxType = taxType;
			this.taxRate = taxRate;
		}

		public String getTaxType() {
			return taxType;
		}

		public void setTaxType(String taxType) {
			this.taxType = taxType;
		}

		public double getTaxRate() {
			return taxRate;
		}

		public void setTaxRate(double taxRate) {
			this.taxRate = taxRate;
		}
	}

}


/*
 * The inner classes Discount and Tax in the Cart class are used to encapsulate related 
 * functionality and data within the Cart class itself. Here's an explanation of their 
 * purpose:

    Discount inner class:
        The Discount class represents a discount applied to the cart.
        
        It has two instance variables: discountName to store the name of the discount 
        	and discountRate to store the rate of the discount.
        	
        The Discount class provides getters and setters for accessing and modifying 
        	the discount information.

    Tax static inner class:
        The Tax class represents a tax applied to the cart.
        
        It has two instance variables: taxType to store the type of the tax and taxRate 
        	to store the rate of the tax.
        	
        The Tax class provides getters and setters for accessing and modifying the 
        	tax information.

The decision to use inner classes in this scenario depends on the design and requirements 
of the application. Here are some potential reasons for implementing inner classes:

    Encapsulation: By defining the Discount and Tax classes as inner classes, they are 
    	closely associated with the Cart class and can access its private members directly. 
    	This allows for better encapsulation of related functionality within the Cart class.

    Information Hiding: The inner classes can be kept private within the Cart class, 
    	preventing direct access from outside classes. This helps in hiding the 
    	implementation details and maintaining a clean public interface for the Cart class.

    Code Organization: Placing the related classes within the Cart class can improve code 
    	organization, making it easier to locate and understand the code related to discounts 
    	and taxes.

    Code Reusability: If the Discount or Tax classes are not required outside the context of 
    	the Cart class, defining them as inner classes keeps them tightly coupled with the 
    	Cart class and avoids cluttering the global namespace.
 */
