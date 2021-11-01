package it.unibo.oop.lab05.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final Set<String> coll = new TreeSet<>();
    	final ArrayList<String> a = new ArrayList<String>();
    	for(int i = 0; i < 20 ;i++) {
    		a.add(Integer.toString(i));
    	}
    	coll.addAll(a);
    	System.out.println(coll);
    	coll.removeAll(a);
    	for(String s : a) {
    		if(Integer.valueOf(s)%3 != 0) {
    			coll.add(s);
    		}
    	}
    	System.out.println(coll);
    	for(String s : coll) {
    		System.out.println(s);
    	}
    	
    	int cont=0;
    	for(String s : coll) {
    		if(Integer.valueOf(s)%2 == 0) {
    			cont++;
    		}
    	}
    	if(cont == coll.size()) {
    		System.out.println("tutti pari");
    	}else {
    		System.out.println("non tutti pari");
    	}
    }
}
