package it.unibo.oop.lab05.ex4;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl{
	private final Set<Product> l=new TreeSet<>();
	
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		if(!containsProduct(p)) {
			this.l.add(p);		
		}
	}

	public Set<String> allNames() {
		// TODO Auto-generated method stub
		final Set<String> s= new TreeSet<>();
		
		for (final Product p: this.l) {
			s.add(p.getName());
			//System.out.println(p.getName() + " treeset originale");
		}
		return s;
	}

	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return this.l;
	}


	
}
