package br.com.diegorodriguessilva.appdata.repositories;

import br.com.diegorodriguessilva.appdata.entities.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {
    Optional<User> findByUserName(String userName);
}
