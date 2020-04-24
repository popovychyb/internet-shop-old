package mate.academy.internetshop.model;

import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private List<Product> items;
    private User user;

    public Order(List<Product> items, User user) {
        this.items = items;
        this.user = user;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
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
                + ", items=" + items
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
                && Objects.equals(items, order.items)
                && Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, items, user);
    }
}
