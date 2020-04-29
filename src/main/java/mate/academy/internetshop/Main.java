package mate.academy.internetshop;

import mate.academy.internetshop.lib.Injector;
import mate.academy.internetshop.model.Order;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.model.User;
import mate.academy.internetshop.service.OrderService;
import mate.academy.internetshop.service.ProductService;
import mate.academy.internetshop.service.ShoppingCartService;
import mate.academy.internetshop.service.UserService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.internetshop");

    public static void main(String[] args) {
        ProductService productService = (ProductService) injector.getInstance(ProductService.class);
        OrderService orderService = (OrderService) injector.getInstance(OrderService.class);
        ShoppingCartService shoppingCartService =
                (ShoppingCartService) injector.getInstance(ShoppingCartService.class);
        UserService userService = (UserService) injector.getInstance(UserService.class);
        initializeDb(productService, userService, orderService, shoppingCartService);

        productService.getAll().forEach(System.out::println);
        userService.getAll().forEach(System.out::println);
        orderService.getAll().forEach(System.out::println);
        userService.getAll().forEach(u ->
                System.out.println(shoppingCartService.getByUserId(u.getId())));
    }

    private static void initializeDb(ProductService productService,
                                     UserService userService,
                                     OrderService orderService,
                                     ShoppingCartService shoppingCartService) {
        Product product1 = new Product("Ford", 30_000.0);
        Product product2 = new Product("BMW", 40_000.0);
        productService.create(product1);
        productService.create(product2);

        User admin = new User("Admin", "admin", "admin");
        User user = new User("User", "user1", "1234");
        userService.create(admin);
        userService.create(user);

        Order order1 = new Order(productService.getAll(), admin);
        Order order2 = new Order(productService.getAll(), user);
        orderService.create(order1);
        orderService.create(order2);

        //        ShoppingCart shoppingCart1 = new ShoppingCart(admin);
        //        ShoppingCart shoppingCart2 = new ShoppingCart(user);
        //        shoppingCartService.create(shoppingCart1);
        //        shoppingCartService.create(shoppingCart2);
    }
}
