package br.com.diegorodriguessilva.appdomain.contracts.repositories;

import br.com.diegorodriguessilva.appdomain.entities.User;

import java.util.List;

public interface UserRepository {
    User getById(Long Id);

    List<User> search();

    void save(User user);

    void edit(User user);

    void delete(User user);
}
