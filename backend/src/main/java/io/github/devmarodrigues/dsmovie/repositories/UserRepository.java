package io.github.devmarodrigues.dsmovie.repositories;

import io.github.devmarodrigues.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
