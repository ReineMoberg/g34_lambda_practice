package se.lexicon.interfaces;

import se.lexicon.model.Product;

@FunctionalInterface
public interface Action {
    void execute(Product p);
}
