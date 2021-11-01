package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product{
	private final String name;
	private final int quantity;
	
	
	
	public ProductImpl(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	public double getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}


	@Override
	public String toString() {
		return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
	}
	
	

}
