package repository;

import model.Product;
import java.util.List;
import java.util.ArrayList;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(int id) {
        return products.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}