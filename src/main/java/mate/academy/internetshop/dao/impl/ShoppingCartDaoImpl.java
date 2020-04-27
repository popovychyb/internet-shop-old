package mate.academy.internetshop.dao.impl;

import java.util.List;
import java.util.Optional;
import mate.academy.internetshop.dao.ShoppingCartDao;
import mate.academy.internetshop.db.Storage;
import mate.academy.internetshop.lib.Dao;
import mate.academy.internetshop.model.ShoppingCart;

@Dao
public class ShoppingCartDaoImpl implements ShoppingCartDao {

    @Override
    public ShoppingCart create(ShoppingCart shoppingCart) {
        Storage.addShoppingCart(shoppingCart);
        return shoppingCart;
    }

    @Override
    public Optional<ShoppingCart> get(Long shoppingCart) {
        return Storage.shoppingCarts
                .stream()
                .filter(b -> b.getId().equals(shoppingCart))
                .findFirst();
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) {
        ShoppingCart oldShoppingCart = get(shoppingCart.getId()).get();
        Storage.shoppingCarts.set(Storage.shoppingCarts.indexOf(oldShoppingCart), shoppingCart);
        return shoppingCart;
    }

    @Override
    public boolean delete(Long id) {
        return Storage.shoppingCarts.remove(get(id));
    }

    @Override
    public List<ShoppingCart> getAll() {
        return Storage.shoppingCarts;
    }
}
