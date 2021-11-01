package it.unibo.oop.lab05.ex3;

/**
 * Simple test class for {@link Warehouse}.
 *
 */
public final class UseWarehouse {

    private UseWarehouse() {
    }

    /**
     * @param args
     *            unused
     */
    public static void main(final String[] args) {
        /*
         * Realize the classes:
         *
         * 1) WarehouseImpl implements Warehouse. Such class should use internally
         * a java.util.LinkedHashSet. Differently from HashSet the iteration order
         * of LinkedHashSet is predictable and reproducible even when using object
         * that don't implement a custom hashCode.
         * Additionally, LinkedHashSet and HashSet have similar performances:
         * https://www.artima.com/weblogs/viewpost.jsp?thread=122295
         *
         * 2) ProductImpl implements Product. Remember that two products are the
         * same if their name is the same.
         *
         * Read VERY carefully the comments in the implemented interfaces and use
         * them to run the test.
         */

        final ProductImpl p1 = new ProductImpl("samsung",5);
        final ProductImpl p2 = new ProductImpl("iphone",2);
        final ProductImpl p3 = new ProductImpl("huawei",10);
        final ProductImpl p4 = new ProductImpl("huawei",25);

        final WarehouseImpl w = new WarehouseImpl();
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);
        w.addProduct(p4);
        System.out.println(w.allNames());
        System.out.println(w.allProducts());
        System.out.println(w.getQuantity("iphone"));
        // Changes to the returned set should not affect the warehouse
        final var modifiedProductSet = w.allProducts();
        modifiedProductSet.remove(p1);

        System.out.println(w.allNames());
        System.out.println(w.allProducts());
        System.out.println(modifiedProductSet);

    }

}
