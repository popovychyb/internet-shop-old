package mate.academy.internetshop;

import java.util.List;
import mate.academy.internetshop.lib.Injector;
import mate.academy.internetshop.model.Product;
import mate.academy.internetshop.service.ProductService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy.internetshop");

    public static void main(String[] args) {
        ProductService productService = (ProductService) injector.getInstance(ProductService.class);
        initializeDb(productService);

        List<Product> allProducts = productService.getAll();
        for (Product product : allProducts) {
            System.out.println(product.toString());
        }
    }

    private static void initializeDb(ProductService productService) {
        Product product1 = new Product("Ford", 30_000.0);
        Product product2 = new Product("BMW", 40_000.0);
        Product product3 = new Product("Audi", 50_000.0);
        productService.create(product1);
        productService.create(product2);
        productService.create(product3);
    }
}
