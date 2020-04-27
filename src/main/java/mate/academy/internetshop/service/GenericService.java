package mate.academy.internetshop.service;

import java.util.List;

public interface GenericService<T, S> {
    T create(T element);

    T get(S id);

    List<T> getAll();

    T update(T element);

    boolean delete(S id);
}
