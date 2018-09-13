package dao;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public Product find() {
        return new Product("p01", "name 1", 100);
    }

    public List<Product> findAll() {
        List<Product> result = new ArrayList<>();
        result.add(new Product("p01", "name 1", 100));
        result.add(new Product("p02", "name 2", 200));
        result.add(new Product("p03", "name 3", 300));
        return result;
    }
}
