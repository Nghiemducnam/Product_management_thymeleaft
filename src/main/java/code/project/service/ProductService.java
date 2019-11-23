package code.project.service;

import code.project.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void remove(int id);

    void update(int id, Product product);

    Product findById(int id);

    void save (Product product);
}
