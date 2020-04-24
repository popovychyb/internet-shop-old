package mate.academy.internetshop.service;

import java.util.List;
import java.util.Optional;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.model.User;

public interface OrderService {

    Order create(Order order);

    Order completeOrder(List<Product> products, User user);

    Optional<List<Order>> getUserOrders(User user);

    Order get(Long id);

    List<Order> getAll();

    Order update(Order order);

    boolean delete(Long id);
}
