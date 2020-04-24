package mate.academy.internetshop.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import mate.academy.internetshop.dao.OrderDao;
import mate.academy.internetshop.lib.Inject;
import mate.academy.internetshop.lib.Service;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.model.User;
import mate.academy.internetshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Inject
    private static OrderDao orderDao;

    @Override
    public Order create(Order order) {
        return orderDao.create(order);
    }

    @Override
    public Order completeOrder(List<Product> products, User user) {
        Order order = create(new Order(products, user));
        update(order);
        return order;
    }

    @Override
    public Optional<List<Order>> getUserOrders(User user) {
        Long userId = user.getId();
        return Optional.of(orderDao.getAll().stream()
                .filter(order -> order.getUser().equals(userId))
                .collect(Collectors.toList()));
    }

    @Override
    public Order get(Long id) {
        return orderDao.get(id).get();
    }

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    @Override
    public Order update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public boolean delete(Long id) {
        return orderDao.delete(id);
    }
}
