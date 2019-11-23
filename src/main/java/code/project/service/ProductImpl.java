package code.project.service;

import code.project.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductImpl implements ProductService {
    private static Map<Integer,Product>products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Nokia",7000000,"microsoft - made in China",
                "https://cdn.tgdd.vn/Products/Images/42/194917/nokia-81-blue-18thangbh-600x600.jpg"));
        products.put(2,new Product(2,"Samsung Note 10",12000000,"Samsung - made in VN",
                "https://images-na.ssl-images-amazon.com/images/I/71znGoLL%2B4L._SL1500_.jpg"));
        products.put(3,new Product(3,"Iphone X",20000000,
                "Apple - made in USA","https://cdn.tgdd.vn/Products/Images/42/114115/iphone-x-64gb-2-400x460.png"));
        products.put(4,new Product(4,"Bphone",5000000,"BKAV - made in VN",
                "https://m.bkav.com.vn/BpChild-portlet/html/homebphone3mobile/Bphone3/thietkedinhcao.png"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }
}
