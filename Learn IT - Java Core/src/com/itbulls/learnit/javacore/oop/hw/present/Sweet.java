package com.itbulls.learnit.javacore.oop.hw.present;

public class Sweet {

	private String name;
	private double weight; // kg
	private double sugarWeight; // kg

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSugarWeight() {
		return sugarWeight;
	}

	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}

	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}

}
