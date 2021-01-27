package se.lexicon.interfaces;

import se.lexicon.model.Product;

@FunctionalInterface
public interface Conditional {

    boolean test(Product p);

}
