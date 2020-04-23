package mate.academy.internetshop.db;

import java.util.ArrayList;
import java.util.List;
import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.model.User;

public class Storage {
    public static final List<User> USERS = new ArrayList<>();
    public static final List<Product> PRODUCTS = new ArrayList<>();
    public static final List<Bucket> BUCKETS = new ArrayList<>();
    public static final List<Order> ORDERS = new ArrayList<>();
    private static Long userId = 0L;
    private static Long bucketId = 0L;
    private static Long orderId = 0L;
    private static Long productId = 0L;

    private Storage() {
    }

    public static void addProduct(Product product) {
        productId++;
        product.setId(productId);
        PRODUCTS.add(product);
    }

    public static void addUser(User user) {
        userId++;
        user.setId(userId);
        USERS.add(user);
    }

    public static void addBucket(Bucket bucket) {
        bucketId++;
        bucket.setId(bucketId);
        BUCKETS.add(bucket);
    }

    public static void addOrder(Order order) {
        orderId++;
        order.setId(orderId);
        ORDERS.add(order);
    }
}
