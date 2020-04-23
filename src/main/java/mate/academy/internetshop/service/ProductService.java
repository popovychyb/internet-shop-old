package mate.academy.internetshop.service;

import java.util.List;
import mate.academy.internetshop.model.Product;

public interface ProductService {
    Product create(Product product);

    Product get(Long id);

    Product update(Product product);

    void delete(Long id);

    void delete(Product product);

    List<Product> getAll();
}
