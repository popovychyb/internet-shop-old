package mate.academy.internetshop.dao.impl;

import java.util.List;
import java.util.NoSuchElementException;
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
    public ShoppingCart get(Long bucketId) {
        return Storage.shoppingCarts
                .stream()
                .filter(b -> b.getId().equals(bucketId))
                .findFirst()
                .orElseThrow(() ->
                        new NoSuchElementException("Can't find bucket with id " + bucketId));
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return Storage.shoppingCarts.remove(get(id));
    }

    @Override
    public boolean delete(ShoppingCart shoppingCart) {
        return Storage.shoppingCarts.remove(shoppingCart);
    }

    @Override
    public List<ShoppingCart> getAll() {
        return Storage.shoppingCarts;
    }

}
