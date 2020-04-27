package mate.academy.internetshop.dao;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T, S> {
    T create(T product);

    Optional<T> get(S id);

    List<T> getAll();

    T update(T product);

    boolean delete(S id);
}
