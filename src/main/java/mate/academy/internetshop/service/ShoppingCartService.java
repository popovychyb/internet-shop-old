package mate.academy.internetshop.service;

import java.util.List;
import mate.academy.internetshop.dao.GenericDao;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.model.ShoppingCart;

public interface ShoppingCartService extends GenericDao<ShoppingCart, Long> {

    ShoppingCart addProduct(ShoppingCart shoppingCart, Product product);

    boolean deleteProduct(ShoppingCart shoppingCart, Product product);

    void clear(ShoppingCart shoppingCart);

    ShoppingCart getByUserId(Long userId);

    List<ShoppingCart> getAllProducts(ShoppingCart shoppingCart);
}
