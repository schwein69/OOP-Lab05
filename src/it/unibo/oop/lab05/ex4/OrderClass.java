package it.unibo.oop.lab05.ex4;

import java.util.Comparator;

import it.unibo.oop.lab05.ex3.Product;


public class OrderClass implements Comparator<Product>{

	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName()) < 0){
			return -1;
		}else {
			return 0;
		}
	}	
			
	}
