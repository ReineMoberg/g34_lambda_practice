package se.lexicon;


import se.lexicon.interfaces.Action;
import se.lexicon.interfaces.Conditional;
import se.lexicon.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("iphone x", 90, 1));
        products.add(new Product("surface book 2", 150, 20));
        products.add(new Product("iphone 6s", 120, 0));
        products.add(new Product("iphone 8", 1800, 5));


        /*
        • Print out all Products that have stock value of 0.
        • Print out the productName of all the Products that starts with B.
        • Print out all Products that have price above 100 AND lower than 150
        • Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
         */

        //Print out all Products that have stock value of 0.
        Conditional conditional = p -> p.getStock() == 0;
        Action action = p -> System.out.println(p);
        process(products, conditional, action);
        System.out.println("---------------------");
        //Print out the productName of all the Products that starts with B.
        process(products, p -> p.getProductName().startsWith("s"), p -> System.out.println(p));

        // Print out all Products that have price above 100 AND lower than 150
        // Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%

    }


    public static void process(List<Product> productList, Conditional filter, Action action) {
        for (Product product : productList) {

            if (filter.test(product)) {
                action.execute(product);
            }

        }
    }
}
