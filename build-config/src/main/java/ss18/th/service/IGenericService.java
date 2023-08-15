package ss18.th.service;

import java.util.List;

public interface IGenericService<T,E> {
    List<T> getAll();
    T findById(E e);
}

