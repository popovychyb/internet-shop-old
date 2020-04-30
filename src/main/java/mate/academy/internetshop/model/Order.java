package mate.academy.internetshop.model;

import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private List<Product> products;
    private User user;

    public Order(List<Product> products, User user) {
        this.products = products;
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{"
                + "id=" + id
                + ", items=" + products
                + ", user=" + user
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(id, order.id)
                && Objects.equals(products, order.products)
                && Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, user);
    }
}
