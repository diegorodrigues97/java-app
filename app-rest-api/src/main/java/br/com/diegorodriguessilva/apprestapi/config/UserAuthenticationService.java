package br.com.diegorodriguessilva.apprestapi.config;

import java.util.Optional;

import br.com.diegorodriguessilva.appdata.entities.User;
import br.com.diegorodriguessilva.appdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService implements UserDetailsService {

  @Autowired private UserRepository repository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<User> user = repository.findByUserName(username);
    if (user.isPresent()) {
      user.get();
    }

    throw new UsernameNotFoundException("Invalid username and/or password!");
  }
}
