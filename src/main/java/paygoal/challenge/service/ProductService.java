package paygoal.challenge.service;

import paygoal.challenge.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> findAllByOrderByPriceAsc();
    Product getProduct(Long id);
    Product getProductByName(String name);
    void deleteProduct(Long id);
}
