package io.thomas.springsecurityjpaandjdbc.repository;

import io.thomas.springsecurityjpaandjdbc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String username);
}
