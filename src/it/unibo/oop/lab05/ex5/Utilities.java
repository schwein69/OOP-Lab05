package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> tmp = new HashSet<>();
    	for(X x : setA) {
    		if(!tmp.contains(x)) {
				tmp.add(x);
			}
    	}
    	for(X y : setB) {
			if(!tmp.contains(y)) {
				tmp.add(y);
			}
		}
        return (Set<X>) tmp;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> tmp = new HashSet<>();
    	for(X x : setA) {
    		for(X y : setB) {
    			if(x.equals(y) && !tmp.contains(x)) {
    				tmp.add(x);
    			}
    		}
    	}
        return (Set<X>) tmp;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> tmp1 = new HashSet<>();
    	Set<X> tmp2 = new HashSet<>();
    	tmp1=setUnion(setA, setB);
    	tmp2=setIntersection(setA, setB);
    	tmp1.removeAll(tmp2);
    	return tmp1;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	Random r = new Random();
    	int randomNumber = r.nextInt(coll.size());
    	X randomElement = null;
    	int currentIndex = 0;
    	Iterator<? extends X> it = coll.iterator();
    	while(it.hasNext()) {
    		randomElement = it.next();
    		 if (currentIndex == randomNumber)
                 return randomElement;
  
             currentIndex++;
         }
         return randomElement;
    	}
      

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	X e1 = getRandomElement(first);
    	Y e2 = getRandomElement(second);
    	Pair <X,Y> p = new Pair<X,Y>(e1, e2);
        return p;
    }
}
