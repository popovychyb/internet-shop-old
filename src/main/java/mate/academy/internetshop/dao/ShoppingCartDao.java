package mate.academy.internetshop.dao;

import java.util.List;
import mate.academy.internetshop.model.ShoppingCart;

public interface ShoppingCartDao {
    ShoppingCart create(ShoppingCart shoppingCart);

    ShoppingCart get(Long shoppingCartId);

    List<ShoppingCart> getAll();

    ShoppingCart update(ShoppingCart shoppingCart);

    boolean delete(Long id);

    boolean delete(ShoppingCart shoppingCart);
}
