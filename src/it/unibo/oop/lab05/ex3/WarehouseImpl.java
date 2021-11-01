package it.unibo.oop.lab05.ex3;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	private final Set<Product> l=new LinkedHashSet<>();
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		if(!containsProduct(p)) {
			this.l.add(p);		
		}
	}

	@Override
	public Set<String> allNames() {
		// TODO Auto-generated method stub
		final Set<String> s= new LinkedHashSet<>();
		for (final Product p: this.l) {
			s.add(p.getName());
		}
		return s;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<Product>(this.l);
	}

	@Override
	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stunew TreeSet<Product>(b
		for (final Product o: this.l) {
			if(o.getName().equals(p.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		for (final Product p: this.l) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

	

}
