package mate.academy.internetshop.model;

import java.util.List;

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
}
